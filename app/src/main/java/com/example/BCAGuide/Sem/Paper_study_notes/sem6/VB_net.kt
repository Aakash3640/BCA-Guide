package Sem.Paper_study_notes.sem6


import Sem.SEM6.VB_Net.vb_book
import Sem.SEM6.VB_Net.vb_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.firebase.R
import soup.neumorphism.NeumorphCardView

class VB_net : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.vb_net)


        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, vb_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, vb_book::class.java))
            Animatoo.animateZoom(this)

        }
    }
}