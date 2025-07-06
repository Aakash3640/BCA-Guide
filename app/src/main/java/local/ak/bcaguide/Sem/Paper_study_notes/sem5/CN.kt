package Sem.Paper_study_notes.sem5


import Sem.SEM5.CN.cn_book
import Sem.SEM5.CN.cn_notes
import Sem.SEM5.CN.cn_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class CN : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cn)


        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, cn_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, cn_book::class.java))
            Animatoo.animateZoom(this)

        }

        val notes = findViewById<NeumorphCardView>(R.id.notes)
        notes.setOnClickListener {
            startActivity(Intent(this, cn_notes::class.java))
            Animatoo.animateZoom(this)

        }
    }
}