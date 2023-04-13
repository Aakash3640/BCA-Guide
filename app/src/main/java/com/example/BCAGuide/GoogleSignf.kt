package com.example.BCAGuide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.firebase.R
import com.google.android.gms.auth.api.Auth
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.auth.api.signin.GoogleSignInResult
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.SignInButton
import com.google.android.gms.common.api.GoogleApiClient

class GoogleSignf : AppCompatActivity(), GoogleApiClient.OnConnectionFailedListener {

    override fun onConnectionFailed(p0: ConnectionResult) {

    }
    internal lateinit var singinbtn:SignInButton
    private var RC_SIGN_IN =1
    private var googleApiClient : GoogleApiClient?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.google_signf)



        //google sign in option
        singinbtn = findViewById(R.id.google)
        val gso = GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
            .requestEmail()
            .build()

        googleApiClient = GoogleApiClient.Builder(this)
            .enableAutoManage(this,this)
            .addApi(Auth.GOOGLE_SIGN_IN_API)
            .build()

        singinbtn.setOnClickListener {
            val i = Auth.GoogleSignInApi.getSignInIntent(googleApiClient!!)
            startActivityForResult(i,RC_SIGN_IN)
        }
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==RC_SIGN_IN){
            val result = data?.let { Auth.GoogleSignInApi.getSignInResultFromIntent(it) }
            handleResult(result!!)
        }
    }

    private fun handleResult(result: GoogleSignInResult){
        if(result.isSuccess){
            startActivity(Intent(this,Profilef::class.java))
        }
        else{
            Toast.makeText(this,"Error in handle Result", Toast.LENGTH_SHORT).show()
        }
    }

}