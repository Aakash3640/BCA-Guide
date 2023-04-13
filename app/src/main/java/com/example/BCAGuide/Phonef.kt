package com.example.BCAGuide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebase.R
import com.google.firebase.auth.FirebaseAuth

import kotlinx.android.synthetic.main.phonef.*

class Phonef : AppCompatActivity() {
    private var firebaseAuth: FirebaseAuth?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.phonef)

        firebaseAuth = FirebaseAuth.getInstance()
        log.setOnClickListener{
            firebaseAuth!!.signOut()
        }
    }
}