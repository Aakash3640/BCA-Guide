package Sem

import Sem.Paper_study_notes.sem1.CFCS_sem1
import Sem.Paper_study_notes.sem1.C_sem1
import Sem.Paper_study_notes.sem1.English_sem1
import Sem.Paper_study_notes.sem1.Statistic_sem1
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Sem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sem1)



        val c = findViewById<NeumorphCardView>(R.id.c)
        c.setOnClickListener {
            startActivity(Intent(this, C_sem1::class.java))
            Animatoo.animateZoom(this)

        }

        val english = findViewById<NeumorphCardView>(R.id.english)
        english.setOnClickListener {
            startActivity(Intent(this, English_sem1::class.java))
            Animatoo.animateZoom(this)

        }

        val statistic = findViewById<NeumorphCardView>(R.id.statistics)
        statistic.setOnClickListener {
            startActivity(Intent(this, Statistic_sem1::class.java))
            Animatoo.animateZoom(this)

        }

        val cfcs = findViewById<NeumorphCardView>(R.id.cfcs)
        cfcs.setOnClickListener {
            startActivity(Intent(this, CFCS_sem1::class.java))
            Animatoo.animateZoom(this)

        }


    }
}