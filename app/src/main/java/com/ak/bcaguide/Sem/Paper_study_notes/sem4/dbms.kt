package Sem.Paper_study_notes.sem4


import Sem.SEM4.DBMS.dbms_book
import Sem.SEM4.DBMS.dbms_paper
import Sem.SEM4.DBMS.dbms_practical_File
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blogspot.atifsoftwares.animatoolib.Animatoo

import com.ak.bcaguide.R
import soup.neumorphism.NeumorphCardView

class dbms : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dbms)


        val paper = findViewById<NeumorphCardView>(R.id.paper)
        paper.setOnClickListener {
            startActivity(Intent(this,dbms_paper::class.java))
            Animatoo.animateZoom(this)

        }
        val book = findViewById<NeumorphCardView>(R.id.book)
        book.setOnClickListener {
            startActivity(Intent(this, dbms_book::class.java))
            Animatoo.animateZoom(this)

        }

        val praticalfile = findViewById<NeumorphCardView>(R.id.practicalfile)
        praticalfile.setOnClickListener {
            startActivity(Intent(this,dbms_practical_File::class.java))
            Animatoo.animateZoom(this)

        }
    }
}