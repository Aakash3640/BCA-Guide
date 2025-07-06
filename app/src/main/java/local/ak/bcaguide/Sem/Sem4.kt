package Sem

import Sem.Paper_study_notes.sem4.Os
import Sem.Paper_study_notes.sem4.Punjabi_sem4
import Sem.Paper_study_notes.sem4.Spm
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Sem4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sem4)



        val dbms = findViewById<NeumorphCardView>(R.id.dbms)
        dbms.setOnClickListener {
            startActivity(Intent(this, Sem.Paper_study_notes.sem4.dbms::class.java))
            Animatoo.animateZoom(this)

        }

        val os = findViewById<NeumorphCardView>(R.id.os)
        os.setOnClickListener {
            startActivity(Intent(this, Os::class.java))
            Animatoo.animateZoom(this)

        }

        val spm = findViewById<NeumorphCardView>(R.id.spm)
        spm.setOnClickListener {
            startActivity(Intent(this, Spm::class.java))
            Animatoo.animateZoom(this)

        }

        val punjabi = findViewById<NeumorphCardView>(R.id.punjabi)
        punjabi.setOnClickListener {
            startActivity(Intent(this,Punjabi_sem4::class.java))
            Animatoo.animateZoom(this)

        }
    }
}