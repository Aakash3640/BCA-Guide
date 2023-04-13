package com.example.BCAGuide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import com.example.firebase.R
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.auth.api.signin.GoogleSignInResult
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.profilef.*

class Profilef : AppCompatActivity(), GoogleApiClient.OnConnectionFailedListener {

    override fun onConnectionFailed(p0: ConnectionResult) {

    }

    private var googleApiClient : GoogleApiClient?=null

    var firebaseAuth : FirebaseAuth?= null
    var firebaseDatabase : FirebaseDatabase?=null
    var firebaseStorage : FirebaseStorage?=null
    var storageReference : StorageReference?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilef)

        val pname = findViewById<TextView>(R.id.pname)
        val pemail = findViewById<TextView>(R.id.pemail)
        val pphone = findViewById<TextView>(R.id.pphone)


    // google sign in code
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        googleApiClient = GoogleApiClient.Builder(this)
            .enableAutoManage(this,this)
            .addApi(Auth.GOOGLE_SIGN_IN_API)
            .build()




        firebaseAuth = FirebaseAuth.getInstance()
        firebaseStorage = FirebaseStorage.getInstance()
        storageReference = firebaseStorage!!.reference

        storageReference!!.child(firebaseAuth!!.uid!!).child("image/Prfile Pic")
            .downloadUrl.addOnSuccessListener {  uri ->
                Picasso.get().load(uri).into(userimage)
            }

        val databaseReference = FirebaseDatabase.getInstance().getReference(firebaseAuth!!.uid!!)
        databaseReference.addValueEventListener(object : ValueEventListener{

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@Profilef,"No Database Exist",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@Profilef,Profilef::class.java))
            }
            override fun onDataChange(snapshot: DataSnapshot) {
                val userprofile = snapshot.getValue(fUserprofile::class.java)
                pname.text = "Name:   "+userprofile?.userName
                pemail.text = "Email:   "+userprofile?.userEmail
                pphone.text = "Phone:   "+userprofile?.userPhone


            }






        })

        update.setOnClickListener {
            startActivity(Intent(this,UpdateProfilef::class.java))
        }



    }

    override fun onStart() {
        super.onStart()

        val opr = googleApiClient?.let { Auth.GoogleSignInApi.silentSignIn(it) }
        if (opr != null) {
            if(opr.isDone){
                val result = opr.get()
                handleResult(result!!)
            }
            else{
                opr.setResultCallback { googleSignInResult->
                    handleResult(googleSignInResult)
                }
            }
        }
    }

    private fun handleResult(result: GoogleSignInResult){
        if(result.isSuccess){
            val account = result.signInAccount
            pname.text = account!!.displayName
            pemail.text = account!!.email

        }
        else{
            Toast.makeText(this,"Error in handle Result",Toast.LENGTH_SHORT).show()
        }
    }
}