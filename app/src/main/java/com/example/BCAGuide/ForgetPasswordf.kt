package com.example.BCAGuide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.firebase.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.forget_passwordf.*


class ForgetPasswordf : AppCompatActivity() {

    var firebaseauth: FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forget_passwordf)
        firebaseauth = FirebaseAuth.getInstance()

        reset.setOnClickListener{
            reset()
        }
    }
    fun reset(){
        var ereset = registeremail.text.toString()
        if(ereset.isEmpty()){
            Toast.makeText(this,"Please Enter Email",Toast.LENGTH_SHORT).show()
        }
        firebaseauth?.sendPasswordResetEmail(ereset)?.addOnCompleteListener { task ->
            if(task.isSuccessful){
                Toast.makeText(this,"Verification Send",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, Loginf::class.java))
            }
            else{
                Toast.makeText(this,"Something Wrong in Reset()",Toast.LENGTH_SHORT).show()

            }
        }

    }
}