package Sem.Paper_study_notes.sem4
import Sem.SEM4.OS.os_book
import Sem.SEM4.OS.os_notes
import Sem.SEM4.OS.os_paper
import Sem.SEM4.OS.os_practical_file
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Os : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.os)



        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, os_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, os_book::class.java))
            Animatoo.animateZoom(this)

        }

        val praticalfile = findViewById<NeumorphCardView>(R.id.praticalfile)
        praticalfile.setOnClickListener {
            startActivity(Intent(this, os_practical_file::class.java))
            Animatoo.animateZoom(this)

        }
        val notes = findViewById<NeumorphCardView>(R.id.notes)
        notes.setOnClickListener {
            startActivity(Intent(this, os_notes::class.java))
            Animatoo.animateZoom(this)

        }
    }
}