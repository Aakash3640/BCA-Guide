package com.example.bcaguide

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.example.BCAGuide.Loginf

import com.example.firebase.R

class Flash_screen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flash_screen)


        supportActionBar?.hide()

//        val welcome = findViewById<TextView>(R.id.title)
        val discription = findViewById<TextView>(R.id.desciption)
        val logo = findViewById<LottieAnimationView>(R.id.logo)
//        val to = findViewById<TextView>(R.id.to)
        val bca = findViewById<TextView>(R.id.bca)
        val web = findViewById<TextView>(R.id.website)


//        val animation: Animation = AnimationUtils.loadAnimation(this,R.anim.bounce)
//        discription.startAnimation(animation)
//
//        val animation3: Animation = AnimationUtils.loadAnimation(this,R.anim.bounce)
//        logo.startAnimation(animation3)
//
//
//
//        val animation5: Animation=AnimationUtils.loadAnimation(this,R.anim.bounce)
//        bca.startAnimation(animation5)
//
//        val animation6: Animation=AnimationUtils.loadAnimation(this,R.anim.bounce)
//        web.startAnimation(animation6)

        Handler(Looper.getMainLooper()).postDelayed(object: Runnable{
            override fun run() {
                val i = Intent(this@Flash_screen, Loginf::class.java)
                startActivity(i)
                Animatoo.animateInAndOut(this@Flash_screen)

            }
        },4000)





    }



}