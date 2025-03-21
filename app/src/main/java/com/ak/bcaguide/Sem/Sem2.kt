package Sem

import Sem.Paper_study_notes.sem2.Co_sem2
import Sem.Paper_study_notes.sem2.Cpp_sem2
import Sem.Paper_study_notes.sem2.English_sem2
import Sem.Paper_study_notes.sem2.FWP_sem2
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Sem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sem2)




        val cpp = findViewById<NeumorphCardView>(R.id.cpp)
        cpp.setOnClickListener {
            startActivity(Intent(this, Cpp_sem2::class.java))
            Animatoo.animateZoom(this)

        }

        val english = findViewById<NeumorphCardView>(R.id.english)
        english.setOnClickListener {
            startActivity(Intent(this, English_sem2::class.java))
            Animatoo.animateZoom(this)

        }

        val co = findViewById<NeumorphCardView>(R.id.co)
        co.setOnClickListener {
            startActivity(Intent(this, Co_sem2::class.java))
            Animatoo.animateZoom(this)
        }

        val fwp = findViewById<NeumorphCardView>(R.id.fwp)
        fwp.setOnClickListener {
            startActivity(Intent(this, FWP_sem2::class.java))
            Animatoo.animateZoom(this)

        }

    }
}