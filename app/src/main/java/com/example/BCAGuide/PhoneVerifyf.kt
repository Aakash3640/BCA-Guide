package com.example.BCAGuide


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.example.firebase.R

import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.android.synthetic.main.activity_phone_mainf.*

import java.util.concurrent.TimeUnit

class PhoneVerifyf : AppCompatActivity() {

    private var verificationid :String?=null
    private var firebaseAuth : FirebaseAuth?=null
    private var progressbar : ProgressBar?=null
    private var editText: EditText?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phone_verifyf)


        firebaseAuth = FirebaseAuth.getInstance()
        progressbar = findViewById(R.id.progressbar)
        editText = findViewById(R.id.otp)

        val phoneno = intent.getStringExtra("phone")

        if (phoneno != null) {
            sendCode(phoneno)
        }


        next.setOnClickListener{
            val codd = editText!!.text.toString()
            if(codd.isEmpty()|| codd.length<6){
                Toast.makeText(this,"Enter Code",Toast.LENGTH_SHORT).show()
            }
            verifycode(codd)
        }



    }

    private fun sendCode(number: String){
        progressbar!!.visibility = View.VISIBLE

//        PhoneAuthProvider.getInstance()
//            .verifyPhoneNumber(
//                number,
//                60,
//                TimeUnit.SECONDS,
//                this,
//                mcallback
//            )

       val options= PhoneAuthOptions.newBuilder(firebaseAuth!!)

           .setPhoneNumber(number)
           .setTimeout(60L,TimeUnit.SECONDS)
           .setActivity(this)
           .setCallbacks(mcallback)
           .build()
        PhoneAuthProvider.verifyPhoneNumber(options)






    }



    private val mcallback = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
        override fun onCodeSent(p0: String, p1: PhoneAuthProvider.ForceResendingToken) {
            super.onCodeSent(p0, p1)
            verificationid=p0
        }
        override fun onVerificationCompleted(p0: PhoneAuthCredential) {
           val code = p0.smsCode
            if(code!=null){
                editText!!.setText(code)
                verifycode(code)

            }
        }

        override fun onVerificationFailed(p0: FirebaseException) {
        Toast.makeText(this@PhoneVerifyf,"Verification Failed",Toast.LENGTH_SHORT).show()
        }
    }
    private fun verifycode(code: String){
        val credential = PhoneAuthProvider.getCredential(verificationid!!,code)
        signIn(credential)
    }
    private fun signIn(credential: PhoneAuthCredential){
        firebaseAuth!!.signInWithCredential(credential).addOnCompleteListener { task->
            if(task.isSuccessful){
                startActivity(Intent(this,Homef::class.java))

        } }
    }
}




