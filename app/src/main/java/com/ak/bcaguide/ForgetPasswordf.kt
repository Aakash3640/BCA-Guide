package com.ak.bcaguide

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth
import soup.neumorphism.NeumorphButton


class ForgetPasswordf : AppCompatActivity() {

    var firebaseAuth: FirebaseAuth? = null
    var reset : NeumorphButton?=null
    var registeremail : EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forget_passwordf)
        firebaseAuth = FirebaseAuth.getInstance()




        reset = findViewById(R.id.reset )
        registeremail = findViewById(R.id.registeremail)
        reset?.setOnClickListener{
            reset()
        }
    }

    override fun onBackPressed() {
        startActivity(Intent(this,Loginf::class.java))
        super.onBackPressed()
    }

    private fun reset(){
        var email:String = registeremail?.text.toString().trim()
        if(email.isEmpty()){
            Toast.makeText(this,"Please Enter a valid Email",Toast.LENGTH_SHORT).show()
        }
        firebaseAuth?.sendPasswordResetEmail(email)?.addOnCompleteListener { task ->
            if(task.isSuccessful){
                Toast.makeText(this,"Verification mail send",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, Loginf::class.java))
                this.finish()
            }
            else{
                Toast.makeText(this,"Error sending reset email",Toast.LENGTH_SHORT).show()

            }
        }

    }
}