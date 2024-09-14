package Sem.Paper_study_notes.sem1


import Sem.SEM1.C.Notes.English_notes

import Sem.SEM1.English.Paper.English_Paper
import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.blogspot.atifsoftwares.animatoolib.Animatoo


import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class English_sem1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_sem1)




        val englishnotes = findViewById<NeumorphCardView>(R.id.englishnotes)
        englishnotes.setOnClickListener {
            startActivity(Intent(this, English_notes::class.java))
            Animatoo.animateZoom(this)

        }
        val englishpaper = findViewById<NeumorphCardView>(R.id.englishpaper)
        englishpaper.setOnClickListener {
            startActivity(Intent(this, English_Paper::class.java))
            Animatoo.animateZoom(this)

        }
    }
}