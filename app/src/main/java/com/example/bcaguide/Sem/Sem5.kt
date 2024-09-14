package Sem


import Sem.Paper_study_notes.sem5.CN
import Sem.Paper_study_notes.sem5.DM
import Sem.Paper_study_notes.sem5.JAVA
import Sem.Paper_study_notes.sem5.PHP
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Sem5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sem5)


        val cn = findViewById<NeumorphCardView>(R.id.cn)
        cn.setOnClickListener {
            startActivity(Intent(this, CN::class.java))
            Animatoo.animateZoom(this)

        }

        val dm = findViewById<NeumorphCardView>(R.id.dm)
        dm.setOnClickListener {
            startActivity(Intent(this, DM::class.java))
            Animatoo.animateZoom(this)

        }

        val ejava = findViewById<NeumorphCardView>(R.id.ejava)
        ejava.setOnClickListener {
            startActivity(Intent(this, JAVA::class.java))
            Animatoo.animateZoom(this)

        }

        val php = findViewById<NeumorphCardView>(R.id.php)
        php.setOnClickListener {
            startActivity(Intent(this, PHP::class.java))
            Animatoo.animateZoom(this)

        }
    }
}