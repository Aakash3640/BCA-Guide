package Sem.Paper_study_notes.sem2

import Sem.SEM2.Cpp.Cpp_Notes
import Sem.SEM2.Cpp.Cpp_Practical_file
import Sem.SEM2.Cpp.Cpp_book
import Sem.SEM2.Cpp.Cpp_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.firebase.R
import soup.neumorphism.NeumorphCardView

class Cpp_sem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpp_sem2)



        val cppbook = findViewById<NeumorphCardView>(R.id.cppbook)
        cppbook.setOnClickListener {
            startActivity(Intent(this, Cpp_book::class.java))
            Animatoo.animateZoom(this)

        }
        val cpppaper = findViewById<NeumorphCardView>(R.id.cpppaper)
        cpppaper.setOnClickListener {
            startActivity(Intent(this, Cpp_paper::class.java))
            Animatoo.animateZoom(this)

        }


        val cppnotes = findViewById<NeumorphCardView>(R.id.cppnotes)
        cppnotes.setOnClickListener {
            startActivity(Intent(this, Cpp_Notes::class.java))
            Animatoo.animateZoom(this)

        }

        val cppprogram = findViewById<NeumorphCardView>(R.id.cppprogram)
        cppprogram.setOnClickListener {
            startActivity(Intent(this, Cpp_Practical_file::class.java))
            Animatoo.animateZoom(this)

        }
    }
}