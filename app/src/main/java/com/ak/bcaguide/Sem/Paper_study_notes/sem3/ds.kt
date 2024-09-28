package Sem.Paper_study_notes.sem3

import Sem.SEM3.DS.ds_book
import Sem.SEM3.DS.ds_notes
import Sem.SEM3.DS.ds_paper
import Sem.SEM3.DS.ds_practical_file
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class ds : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ds)



        val paper = findViewById<NeumorphCardView>(R.id.dspaper)
        paper.setOnClickListener {
            startActivity(Intent(this, ds_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.dsbook)
        book.setOnClickListener {
            startActivity(Intent(this, ds_book::class.java))
            Animatoo.animateZoom(this)

        }

        val praticalfile = findViewById<NeumorphCardView>(R.id.dspraticalfile)
        praticalfile.setOnClickListener {
            startActivity(Intent(this, ds_practical_file::class.java))
            Animatoo.animateZoom(this)

        }

        val note = findViewById<NeumorphCardView>(R.id.dsnotes)
        note.setOnClickListener {
            startActivity(Intent(this, ds_notes::class.java))
            Animatoo.animateZoom(this)

        }
    }
}