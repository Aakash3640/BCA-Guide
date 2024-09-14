package com.example.bcaguide

import Sem.*
import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.drawable.Animatable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

import android.widget.Toast
import androidx.appcompat.widget.TooltipCompat
import androidx.cardview.widget.CardView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.main.Syllabus

import com.google.firebase.auth.FirebaseAuth


class Home : AppCompatActivity() {

    var firebase : FirebaseAuth? = null
    var logoutuser : CardView?=null
    var one : CardView?=null
    var two : CardView?=null
    var three : CardView?=null
    var four : CardView?=null
    var five : CardView?=null
    var six : CardView?=null
    var profile : CardView?=null



    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.hide()



        one = findViewById(R.id.a)
        two = findViewById(R.id.b)
        three = findViewById(R.id.c)
        four = findViewById(R.id.d)
        five = findViewById(R.id.e)
        six = findViewById(R.id.f)
        profile = findViewById(R.id.profile)

        val syllabus = findViewById<CardView>(R.id.syllbus)
        logoutuser= findViewById(R.id.logoutuser)


        syllabus.setOnClickListener {
            startActivity(Intent(this, Syllabus::class.java))
            Animatoo.animateZoom(this)
            this.finish()
        }

        firebase = FirebaseAuth.getInstance()
        logoutuser?.setOnClickListener {
            firebase?.signOut()

            startActivity(Intent(this, Loginf::class.java))
            Toast.makeText(this,"Successfully Logout", Toast.LENGTH_SHORT).show()
            Animatoo.animateShrink(this)
            this.finish()

        }




        profile?.setOnClickListener {

            startActivity(Intent(this, Profilef::class.java))
            Animatoo.animateShrink(this)

            this.finish()

        }


        one?.setOnClickListener {

            startActivity(Intent(this, Sem1::class.java))
            Animatoo.animateShrink(this)
            this.finish()

        }
        two?.setOnClickListener {

            startActivity(Intent(this, Sem2::class.java))
            Animatoo.animateShrink(this)
            this.finish()

        }
        three?.setOnClickListener {

            startActivity(Intent(this, Sem3::class.java))
            Animatoo.animateShrink(this)
            this.finish()

        }
        four?.setOnClickListener {

            startActivity(Intent(this, Sem4::class.java))
            Animatoo.animateShrink(this)
            this.finish()

        }
        five?.setOnClickListener {

            startActivity(Intent(this, Sem5::class.java))
            Animatoo.animateShrink(this)
            this.finish()

        }
        six?.setOnClickListener {

            startActivity(Intent(this, Sem6::class.java))
            Animatoo.animateShrink(this)
            this.finish()

        }





    }




}