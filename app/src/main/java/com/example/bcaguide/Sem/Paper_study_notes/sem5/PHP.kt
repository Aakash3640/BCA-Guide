package Sem.Paper_study_notes.sem5


import Sem.SEM5.PHP.php_book
import Sem.SEM5.PHP.php_paper
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class PHP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.php)

        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this, php_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, php_book::class.java))
            Animatoo.animateZoom(this)

        }
    }
}