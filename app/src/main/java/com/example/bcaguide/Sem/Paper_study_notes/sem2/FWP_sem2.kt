package Sem.Paper_study_notes.sem2

import Sem.SEM2.English_Sem2.English_book_sem2
import Sem.SEM2.English_Sem2.English_notes_sem2
import Sem.SEM2.English_Sem2.English_paper_sem2
import Sem.SEM2.FWP.FWP_book
import Sem.SEM2.FWP.FWP_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class FWP_sem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fwp_sem2)



        val fwppaper = findViewById<NeumorphCardView>(R.id.fwppaper)
        fwppaper.setOnClickListener {
            startActivity(Intent(this, FWP_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val fwpbook = findViewById<NeumorphCardView>(R.id.fwpbook)
        fwpbook.setOnClickListener {
            startActivity(Intent(this, FWP_book::class.java))
            Animatoo.animateZoom(this)

        }


    }
}