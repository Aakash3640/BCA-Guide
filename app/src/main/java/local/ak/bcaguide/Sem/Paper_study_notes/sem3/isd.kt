package local.ak.bcaguide.Sem.Paper_study_notes.sem3


import local.ak.bcaguide.Sem.SEM3.ISD.isd_notes
import Sem.SEM3.ISD.isd_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
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
            startActivity(Intent(this, isd_notes::class.java))
            Animatoo.animateZoom(this)

        }
    }
}