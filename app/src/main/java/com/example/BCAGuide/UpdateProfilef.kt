package com.example.BCAGuide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.example.firebase.R
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

import kotlinx.android.synthetic.main.update_profilef.*

class UpdateProfilef : AppCompatActivity() {
    var uname : EditText? = null
    var uemail : EditText? = null
    var uphone : EditText? = null
    var firebaseAuth : FirebaseAuth?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.update_profilef)

        uname = findViewById(R.id.uname)
        uemail = findViewById(R.id.uemail)
        uphone = findViewById(R.id.uphone)

        firebaseAuth = FirebaseAuth.getInstance()
        val databaseReference = FirebaseDatabase.getInstance().getReference(firebaseAuth!!.uid!!)
        updatenow.setOnClickListener {

            val name = uname?.text.toString()
            val email = uemail?.text.toString()
            val phone = uphone?.text.toString()


            if(name.isEmpty() || email.isEmpty() || phone.isEmpty()){
                Toast.makeText(this,"Fill all field",Toast.LENGTH_SHORT).show()
            }
            else{
                val userprofile = fUserprofile(name,email,phone)
                databaseReference.setValue(userprofile)

                Toast.makeText(this,"Successfully Updated",Toast.LENGTH_SHORT).show()


            }
            finish()
            startActivity(Intent(this,Homef::class.java))
        }



    }

}