package Sem.Paper_study_notes.sem1

import Sem.SEM1.C.Book.C_Pro_Book
import Sem.SEM1.C.Notes.English_notes
import Sem.SEM1.C.Paper.C_papers
import Sem.SEM1.C.Practical_file.C_Practical_file
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.blogspot.atifsoftwares.animatoolib.Animatoo


import com.example.firebase.R
import soup.neumorphism.NeumorphCardView

class C_sem1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_sem1)

//        val backtohome = findViewById<CardView>(R.id.backtohome)
//        backtohome.setOnClickListener {
//            startActivity(Intent(this, Home::class.java))
//            Animatoo.animateZoom(this)
//
//        }

        val cbook = findViewById<NeumorphCardView>(R.id.cbook)
        cbook.setOnClickListener {
            startActivity(Intent(this, C_Pro_Book::class.java))
            Animatoo.animateZoom(this)

        }
        val cpaper = findViewById<NeumorphCardView>(R.id.cpaper)
        cpaper.setOnClickListener {
            startActivity(Intent(this, C_papers::class.java))
            Animatoo.animateZoom(this)

        }


        val cnotes = findViewById<NeumorphCardView>(R.id.cnotes)
        cnotes.setOnClickListener {
            startActivity(Intent(this,English_notes::class.java))
            Animatoo.animateZoom(this)

        }

        val cprogram = findViewById<NeumorphCardView>(R.id.cprogram)
        cprogram.setOnClickListener {
            startActivity(Intent(this, C_Practical_file::class.java))
            Animatoo.animateZoom(this)

        }
    }
}