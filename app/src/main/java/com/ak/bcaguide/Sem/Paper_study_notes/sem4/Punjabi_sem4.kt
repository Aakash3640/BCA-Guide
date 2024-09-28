package Sem.Paper_study_notes.sem4


import Sem.SEM4.PUNJABI_sem4.Punjabi_book_sem4
import Sem.SEM4.PUNJABI_sem4.Punjabi_paper_sem4
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Punjabi_sem4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.punjabi_sem4)


        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, Punjabi_paper_sem4::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, Punjabi_book_sem4::class.java))
            Animatoo.animateZoom(this)

        }


    }
}