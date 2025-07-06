package Sem.Paper_study_notes.sem1


import Sem.SEM1.CFCS.CFCS_book
import Sem.SEM1.CFCS.CFCS_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import local.ak.bcaguide.R


import soup.neumorphism.NeumorphCardView

class CFCS_sem1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cfcs_sem1)

        val cfcsbook = findViewById<NeumorphCardView>(R.id.cfcsbook)
        cfcsbook.setOnClickListener {
            startActivity(Intent(this, CFCS_book::class.java))
            Animatoo.animateZoom(this)

        }
        val cfcspaper = findViewById<NeumorphCardView>(R.id.cfcspaper)
        cfcspaper.setOnClickListener {
            startActivity(Intent(this, CFCS_paper::class.java))
            Animatoo.animateZoom(this)

        }
    }
}