package com.example.BCAGuide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast


import com.example.firebase.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.homef.*

class Homef : AppCompatActivity() {
    var firebase : FirebaseAuth? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homef)


        firebase = FirebaseAuth.getInstance()
        logout.setOnClickListener {
            firebase?.signOut()
            startActivity(Intent(this, Loginf::class.java))
            Toast.makeText(this,"Successfully Logout",Toast.LENGTH_SHORT).show()
        }

    }
}