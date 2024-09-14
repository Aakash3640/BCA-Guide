package com.example.bcaguide

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView


import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

import com.squareup.picasso.RequestCreator

import soup.neumorphism.NeumorphButton




class Profilef : AppCompatActivity(){

    lateinit var pname:TextView
    lateinit var pemail:TextView
    lateinit var pphone:TextView

    var back : NeumorphButton?=null
    var firebaseAuth : FirebaseAuth?= null
    var firebaseStorage : FirebaseStorage?=null
    var storageReference : StorageReference?=null




    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilef)


        pname = findViewById(R.id.pname)
        pemail = findViewById(R.id.pemail)
        pphone = findViewById(R.id.pphone)
        back = findViewById(R.id.back)

    back?.setOnClickListener {

        startActivity(Intent(this,Home::class.java))
        this.finish()
    }

        firebaseAuth = FirebaseAuth.getInstance()
        firebaseStorage = FirebaseStorage.getInstance()




        val databaseReference = FirebaseDatabase.getInstance().getReference("Users")
        databaseReference.addValueEventListener(object : ValueEventListener {

            override fun onCancelled(error: DatabaseError) {
                Toast.makeText(this@Profilef,"No Database Exist",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@Profilef,Profilef::class.java))
            }
            @SuppressLint("SetTextI18n")
            override fun onDataChange(snapshot: DataSnapshot) {

                
                val userprofile = snapshot.getValue(User::class.java)

                
                pname.text = "Name:   "+userprofile?.name
                pemail.text = "Email:   "+userprofile?.email
                pphone.text = "Phone:   "+userprofile?.phone



            }


        })
    }

}

private fun Bundle.putSerializable(s: String, userprofile: User?) {

}

fun RequestCreator.into(userimage: CardView?): CardView? {
    return userimage

}

