package Sem.Paper_study_notes.sem3


import Sem.SEM3.CONM.conm_book
import Sem.SEM3.CONM.conm_paper
import Sem.SEM3.CONM.conm_pratical_file
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class conm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conm)


        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, conm_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, conm_book::class.java))
            Animatoo.animateZoom(this)

        }

        val praticalfile = findViewById<NeumorphCardView>(R.id.practicalfile)
        praticalfile.setOnClickListener {
            startActivity(Intent(this, conm_pratical_file::class.java))
            Animatoo.animateZoom(this)

        }
    }
}