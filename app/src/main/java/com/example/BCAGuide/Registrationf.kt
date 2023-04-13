package com.example.BCAGuide

import android.app.Activity
import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import com.example.firebase.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference
import com.squareup.picasso.Picasso

import kotlinx.android.synthetic.main.registrationf.*

class Registrationf : AppCompatActivity() {
    var firebase : FirebaseAuth?=null
    var progressbar : ProgressDialog?=null

  lateinit var uname: String
  lateinit var  uemail: String
  lateinit var  uphone : String

                            // 12 is random number u can give any but not negative value
  private var pick_image_request =12
    private var imagePath: Uri?=null
    private  var firebaseStorage : FirebaseStorage?=null
    private var storageReference : StorageReference?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registrationf)

        progressbar = ProgressDialog(this)

        firebase = FirebaseAuth.getInstance()
        firebaseStorage = FirebaseStorage.getInstance()
        storageReference = FirebaseStorage.getInstance().reference

        profileimage.setOnClickListener {
            filechooser()
        }

        register.setOnClickListener{
            registernow()

        }

    backtologin.setOnClickListener {
        startActivity(Intent(this, Loginf::class.java))
    }



    }
    fun registernow(){
        progressbar?.setMessage("Please Wait")
        progressbar?.show()
        var e = newuser.text.toString()
        var p = newpass.text.toString()


        uname = name.text.toString()
        uemail = newuser.text.toString()
        uphone = newphone.text.toString()

        if(e.isEmpty()|| p.isEmpty() || uname.isEmpty() || uemail.isEmpty()|| uphone.isEmpty()){
            progressbar?.dismiss()
            Toast.makeText(this,"Please fill Fields",Toast.LENGTH_SHORT).show()

        }
        else{
            progressbar?.dismiss()
            firebase!!.createUserWithEmailAndPassword(e,p).addOnCompleteListener{task ->
               if(task.isSuccessful){
                sendData()
                   mailAuthentication()

               }
                else{
                   Toast.makeText(this,"Try Again!",Toast.LENGTH_SHORT).show()

               }
            }

        }
    }



    fun mailAuthentication(){
        val auth = firebase?.currentUser
        auth?.sendEmailVerification()?.addOnCompleteListener{ task ->
            if(task.isSuccessful){
                Toast.makeText(this,"Verification Mail Sent",Toast.LENGTH_SHORT).show()
                firebase?.signOut()
                startActivity(Intent(this,Loginf::class.java))
            }
            else{
                Toast.makeText(this,"Something wrong",Toast.LENGTH_SHORT).show()

            }
        }
    }



    fun sendData(){


        val firebaseDatabase = FirebaseDatabase.getInstance()
        val myreference = firebaseDatabase.getReference(firebase?.uid.toString())
        val userProfile = fUserprofile(uname,uemail,uphone)
        myreference.setValue(userProfile)


        // This code for image selection
        val imageref = storageReference!!.child(firebase!!.uid!!).child("image")
            .child("Prfile Pic")
        val uploadimage = imageref.putFile(imagePath!!)
        uploadimage.addOnFailureListener{
            Toast.makeText(this,"Error Occur",Toast.LENGTH_SHORT).show()
        }
    }


private fun filechooser(){
    val intent = Intent()
    intent.type = "image/*"
    intent.action = Intent.ACTION_GET_CONTENT
    startActivityForResult(intent,pick_image_request)

}

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == pick_image_request && resultCode == Activity.RESULT_OK
            && data!=null && data.data!=null)
                imagePath = data.data
        Picasso.get().load(imagePath).into(profileimage)
    }


}