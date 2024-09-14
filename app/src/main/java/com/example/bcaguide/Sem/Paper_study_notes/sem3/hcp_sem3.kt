package Sem.Paper_study_notes.sem3


import Sem.SEM3.HCP.hcp_book_sem3
import Sem.SEM3.HCP.hcp_paper_sem3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class hcp_sem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hcp_sem3)


        val paper = findViewById<NeumorphCardView>(R.id.hcppaper)
        paper.setOnClickListener {
            startActivity(Intent(this, hcp_paper_sem3::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.hcpbook)
        book.setOnClickListener {
            startActivity(Intent(this, hcp_book_sem3::class.java))
            Animatoo.animateZoom(this)

        }

    }
}