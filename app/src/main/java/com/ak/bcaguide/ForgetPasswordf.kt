package com.ak.bcaguide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
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
    fun reset(){
        var ereset = registeremail?.text.toString()
        if(ereset.isEmpty()){
            Toast.makeText(this,"Please Enter Email",Toast.LENGTH_SHORT).show()
        }
        firebaseAuth?.sendPasswordResetEmail(ereset)?.addOnCompleteListener { task ->
            if(task.isSuccessful){
                Toast.makeText(this,"Verification mail send",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, Loginf::class.java))
                this.finish()
            }
            else{
                Toast.makeText(this,"Something Wrong in Reset()",Toast.LENGTH_SHORT).show()

            }
        }

    }
}