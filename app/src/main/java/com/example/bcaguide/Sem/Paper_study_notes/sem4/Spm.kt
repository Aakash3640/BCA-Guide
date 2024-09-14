package Sem.Paper_study_notes.sem4


import Sem.SEM4.SPM.Spm_book
import Sem.SEM4.SPM.Spm_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Spm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spm)


        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, Spm_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, Spm_book::class.java))
            Animatoo.animateZoom(this)

        }


    }
}