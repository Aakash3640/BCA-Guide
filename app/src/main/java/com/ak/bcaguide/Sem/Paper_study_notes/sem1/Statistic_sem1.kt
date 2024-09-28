package Sem.Paper_study_notes.sem1

import Sem.SEM1.Statistic.Statistic_book
import Sem.SEM1.Statistic.Statistic_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Statistic_sem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistic_sem1)

        val statisticbook = findViewById<NeumorphCardView>(R.id.statisticbook)
        statisticbook.setOnClickListener {
            startActivity(Intent(this, Statistic_book::class.java))
            Animatoo.animateZoom(this)

        }
        val statisticpaper = findViewById<NeumorphCardView>(R.id.statisticpaper)
        statisticpaper.setOnClickListener {
            startActivity(Intent(this, Statistic_paper::class.java))
            Animatoo.animateZoom(this)

        }
    }
}