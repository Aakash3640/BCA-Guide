package Sem.Paper_study_notes.sem5


import Sem.SEM5.JAVA.java_book
import Sem.SEM5.JAVA.java_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class JAVA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.java)

        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, java_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, java_book::class.java))
            Animatoo.animateZoom(this)

        }
    }
}