package Sem.Paper_study_notes.sem2

import Sem.SEM2.CO.Co_book
import Sem.SEM2.CO.Co_notes
import Sem.SEM2.CO.Co_paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Co_sem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.co_sem2)



        val copaper = findViewById<NeumorphCardView>(R.id.copaper)
        copaper.setOnClickListener {
            startActivity(Intent(this, Co_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val cobook = findViewById<NeumorphCardView>(R.id.cobook)
        cobook.setOnClickListener {
            startActivity(Intent(this, Co_book::class.java))
            Animatoo.animateZoom(this)

        }

        val conote = findViewById<NeumorphCardView>(R.id.conotes)
        conote.setOnClickListener {
            startActivity(Intent(this, Co_notes::class.java))
            Animatoo.animateZoom(this)

        }
    }
}