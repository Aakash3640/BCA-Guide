package com.example.BCAGuide

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.bcaguide.Home
import com.example.firebase.R
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.GoogleApiClient
import com.google.firebase.auth.FirebaseAuth

import kotlinx.android.synthetic.main.activity_mainf.*

class Loginf : AppCompatActivity(),GoogleApiClient.OnConnectionFailedListener {

    var email: EditText? = null
    var pass : EditText? = null
    lateinit var btn : Button
    var firebase : FirebaseAuth?=null
    var progressbar : ProgressDialog?=null


    internal lateinit var singinbtn: SignInButton
    private var RC_SIGN_IN =1
    private var googleApiClient : GoogleApiClient?=null



    override fun onConnectionFailed(p0: ConnectionResult) {

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainf)

        email = findViewById(R.id.email)
        pass = findViewById(R.id.password)
        btn= findViewById(R.id.signin)

        firebase = FirebaseAuth.getInstance()
        progressbar = ProgressDialog(this)

        btn.setOnClickListener {
            validate()
            startActivity(Intent(this,Home::class.java))
        }

        forget.setOnClickListener{
            startActivity(Intent(this,ForgetPasswordf::class.java))
        }

        // This will save your user id so that u don't login you ID
        val user = firebase?.currentUser
        if(user!=null){
            startActivity(Intent(this, Home::class.java))
        }



        // Create User
        createuser.setOnClickListener {
            startActivity(Intent(this,Registrationf::class.java))
        }


        google.setOnClickListener {
            startActivity(Intent(this,GoogleSignf::class.java))

        }



    }


    fun validate(){
        var E = email?.text.toString()
        var P = pass?.text.toString()

        progressbar?.setMessage("Please Wait")
        progressbar?.show()
        if(E.isEmpty() || P.isEmpty()){
            progressbar?.dismiss()
            Toast.makeText(this,"Fill the Necessary Detail",Toast.LENGTH_SHORT).show()
        }
        else{
            firebase!!.signInWithEmailAndPassword(E,P).addOnCompleteListener{task ->
                progressbar?.dismiss()
                if(task.isSuccessful){
                    verifyemail()
                }
                else{
                    Toast.makeText(this,"Invalid User",Toast.LENGTH_SHORT).show()
                }
            }

        }
    }

    fun verifyemail(){
        val user = FirebaseAuth.getInstance().currentUser
        val vmail = user?.isEmailVerified
        startActivity(Intent(this,Home::class.java))
        if(vmail!!){
            finish()
//            startActivity(Intent(this,Homef::class.java))

        }
        else{
            Toast.makeText(this,"Please verify email",Toast.LENGTH_SHORT).show()
            firebase?.signOut()
        }
    }


}