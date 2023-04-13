package com.example.bcaguide

import Sem.*
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import com.example.BCAGuide.Loginf
import com.example.BCAGuide.Syllabus
import com.example.firebase.R
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.homef.*

class Home : AppCompatActivity() {

    var firebase : FirebaseAuth? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        supportActionBar?.hide()

        val one = findViewById<CardView>(R.id.a)
        val two = findViewById<CardView>(R.id.b)
        val three = findViewById<CardView>(R.id.c)
        val four = findViewById<CardView>(R.id.d)
        val five = findViewById<CardView>(R.id.e)
        val six = findViewById<CardView>(R.id.f)
        val web = findViewById<CardView>(R.id.web)
        val syllabus = findViewById<TextView>(R.id.syllabus)


        syllabus.setOnClickListener {
            startActivity(Intent(this, Syllabus::class.java))
            Animatoo.animateZoom(this)
        }

        firebase = FirebaseAuth.getInstance()
        logoutuser.setOnClickListener {
            firebase?.signOut()
            startActivity(Intent(this, Loginf::class.java))
            Toast.makeText(this,"Successfully Logout", Toast.LENGTH_SHORT).show()
        }

        web.setOnClickListener{
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("https://learnfworld.blogspot.com"))

            startActivity(i)
        }

        one.setOnClickListener {
            one.setCardBackgroundColor(getResources().getColor(R.color.green))
            startActivity(Intent(this, Sem1::class.java))
            Animatoo.animateZoom(this)

        }
        two.setOnClickListener {
            two.setCardBackgroundColor(getResources().getColor(R.color.green))

            startActivity(Intent(this, Sem2::class.java))
            Animatoo.animateZoom(this)

        }
        three.setOnClickListener {
            three.setCardBackgroundColor(getResources().getColor(R.color.green))
            startActivity(Intent(this, Sem3::class.java))
            Animatoo.animateZoom(this)

        }
        four.setOnClickListener {
            four.setCardBackgroundColor(getResources().getColor(R.color.green))
            startActivity(Intent(this, Sem4::class.java))
            Animatoo.animateZoom(this)

        }
        five.setOnClickListener {
            five.setCardBackgroundColor(getResources().getColor(R.color.green))
            startActivity(Intent(this, Sem5::class.java))
            Animatoo.animateZoom(this)

        }
        six.setOnClickListener {
            six.setCardBackgroundColor(getResources().getColor(R.color.green))
            startActivity(Intent(this, Sem6::class.java))
            Animatoo.animateZoom(this)

        }






    }



}