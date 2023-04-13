package Sem.Paper_study_notes.sem5


import Sem.SEM5.DMATH.D_math_book
import Sem.SEM5.DMATH.D_math_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.firebase.R
import soup.neumorphism.NeumorphCardView

class DM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dm)

        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, D_math_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, D_math_book::class.java))
            Animatoo.animateZoom(this)

        }


    }
}