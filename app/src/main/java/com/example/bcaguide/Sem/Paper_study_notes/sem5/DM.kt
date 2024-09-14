package Sem.Paper_study_notes.sem5


import Sem.SEM5.DMATH.D_math_book
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.R
import com.example.bcaguide.Sem.SEM5.DMATH.Dmathpaper
import soup.neumorphism.NeumorphCardView

class DM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dm)

        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, Dmathpaper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, D_math_book::class.java))
            Animatoo.animateZoom(this)

        }


    }
}