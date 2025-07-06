package Sem

import Sem.Paper_study_notes.sem6.CGMA
import Sem.Paper_study_notes.sem6.E_Commerce
import Sem.Paper_study_notes.sem6.VB_net
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo
import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Sem6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sem6)

        val cgma = findViewById<NeumorphCardView>(R.id.cgma)
        cgma.setOnClickListener {
            startActivity(Intent(this, CGMA::class.java))
            Animatoo.animateZoom(this)

        }

        val ec = findViewById<NeumorphCardView>(R.id.ec)
        ec.setOnClickListener {
            startActivity(Intent(this, E_Commerce::class.java))
            Animatoo.animateZoom(this)

        }

        val vb = findViewById<NeumorphCardView>(R.id.vbnet)
        vb.setOnClickListener {
            startActivity(Intent(this, VB_net::class.java))
            Animatoo.animateZoom(this)

        }



    }
}