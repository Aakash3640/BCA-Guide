package Sem.Paper_study_notes.sem6


import Sem.SEM6.CGMA6.Cgma_book
import Sem.SEM6.CGMA6.Cgma_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class CGMA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cgma)


        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, Cgma_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, Cgma_book::class.java))
            Animatoo.animateZoom(this)

        }
    }
}