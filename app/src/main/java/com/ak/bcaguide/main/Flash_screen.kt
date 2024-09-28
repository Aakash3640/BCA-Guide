package com.ak.bcaguide.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.ak.bcaguide.Loginf


import com.ak.bcaguide.R

class Flash_screen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flash_screen)


        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this@Flash_screen, Loginf::class.java)
            startActivity(i)
            Animatoo.animateInAndOut(this@Flash_screen)
        },4000)





    }



}