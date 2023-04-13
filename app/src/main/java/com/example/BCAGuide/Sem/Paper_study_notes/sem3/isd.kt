package Sem.Paper_study_notes.sem3

import Sem.SEM3.ISD.isd_book
import Sem.SEM3.ISD.isd_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.firebase.R
import soup.neumorphism.NeumorphCardView

class isd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isd)




        val paper = findViewById<NeumorphCardView>(R.id.isdpaper)
        paper.setOnClickListener {
            startActivity(Intent(this, isd_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.isdbook)
        book.setOnClickListener {
            startActivity(Intent(this, isd_book::class.java))
            Animatoo.animateZoom(this)

        }
    }
}