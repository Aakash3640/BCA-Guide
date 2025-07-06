package Sem.Paper_study_notes.sem2

import Sem.SEM2.English_Sem2.English_book_sem2
import Sem.SEM2.English_Sem2.English_notes_sem2
import Sem.SEM2.English_Sem2.English_paper_sem2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class English_sem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_sem2)


        val englishpaper = findViewById<NeumorphCardView>(R.id.englishpaper)
        englishpaper.setOnClickListener {
            startActivity(Intent(this, English_paper_sem2::class.java))
            Animatoo.animateZoom(this)

        }
        val englishbook = findViewById<NeumorphCardView>(R.id.englishbook)
        englishbook.setOnClickListener {
            startActivity(Intent(this, English_book_sem2::class.java))
            Animatoo.animateZoom(this)

        }

        val englishnote = findViewById<NeumorphCardView>(R.id.englishnote)
        englishnote.setOnClickListener {
            startActivity(Intent(this, English_notes_sem2::class.java))
            Animatoo.animateZoom(this)

        }
    }
}