package Sem


import Sem.Paper_study_notes.sem3.hcp_sem3
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import local.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Sem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sem3)



        val conm = findViewById<NeumorphCardView>(R.id.conm)
        conm.setOnClickListener {
            startActivity(Intent(this, Sem.Paper_study_notes.sem3.conm::class.java))
            Animatoo.animateZoom(this)

        }

        val ds = findViewById<NeumorphCardView>(R.id.ds)
        ds.setOnClickListener {
            startActivity(Intent(this, Sem.Paper_study_notes.sem3.ds::class.java))
            Animatoo.animateZoom(this)

        }

        val hcp = findViewById<NeumorphCardView>(R.id.hcp)
        hcp.setOnClickListener {
            startActivity(Intent(this, hcp_sem3::class.java))
        }

        val isd = findViewById<NeumorphCardView>(R.id.isd)
        isd.setOnClickListener {
            startActivity(Intent(this, local.ak.bcaguide.Sem.Paper_study_notes.sem3.isd::class.java))
            Animatoo.animateZoom(this)

        }
    }
}