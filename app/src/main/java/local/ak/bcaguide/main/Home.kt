package local.ak.bcaguide.main

import Sem.*
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.widget.Toast
import androidx.cardview.widget.CardView
import local.ak.bcaguide.R
import com.blogspot.atifsoftwares.animatoolib.Animatoo



import com.google.firebase.auth.FirebaseAuth
import local.ak.bcaguide.Loginf
import local.ak.bcaguide.Profilef


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


        }


        one?.setOnClickListener {

            startActivity(Intent(this, Sem1::class.java))
            Animatoo.animateShrink(this)


        }
        two?.setOnClickListener {

            startActivity(Intent(this, Sem2::class.java))
            Animatoo.animateShrink(this)


        }
        three?.setOnClickListener {

            startActivity(Intent(this, Sem3::class.java))
            Animatoo.animateShrink(this)


        }
        four?.setOnClickListener {

            startActivity(Intent(this, Sem4::class.java))
            Animatoo.animateShrink(this)


        }
        five?.setOnClickListener {

            startActivity(Intent(this, Sem5::class.java))
            Animatoo.animateShrink(this)


        }
        six?.setOnClickListener {

            startActivity(Intent(this, Sem6::class.java))
            Animatoo.animateShrink(this)


        }





    }




}