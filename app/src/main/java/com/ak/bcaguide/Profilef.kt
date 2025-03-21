package com.ak.bcaguide

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

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
import org.w3c.dom.Text

import soup.neumorphism.NeumorphButton







class Profilef : AppCompatActivity(){

    lateinit var pname:TextView
   lateinit var pemail:TextView
    lateinit var pphone:TextView

    var back : NeumorphButton?=null
    var firebaseAuth : FirebaseAuth?= null
    var firebaseStorage : FirebaseStorage?=null
    var storageReference : StorageReference?=null




    @SuppressLint("MissingInflatedId", "SetTextI18n")
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
        val userid = FirebaseAuth.getInstance().currentUser?.uid
        databaseReference.child(userid!!).get().addOnSuccessListener {

            if (it.exists()) {

                // Try to get data from the "name", "email", "phone" fields
                var name = it.child("name").value
                var email = it.child("email").value
                var phone = it.child("phone").value

                // If data does not exist in "name", "email", "phone", check "a", "b", "c"
                if (name == null || email == null || phone == null) {
                    name = it.child("a").value
                    email = it.child("b").value
                    phone = it.child("c").value
                }
                pname.text = "Name: $name"
                pemail.text = "Email: $email"
                pphone.text = "Phone: $phone"


            } else {
                Toast.makeText(this, "User doesn't exists", Toast.LENGTH_SHORT).show()
            }
        }.addOnFailureListener {

            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()

        }



    }

}

private fun Bundle.putSerializable(s: String, userprofile: User?) {

}

fun RequestCreator.into(userimage: CardView?): CardView? {
    return userimage

}


