package Sem.SEM1.C.Book

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class C_Pro_Book : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_pro_book)





        val c_letusc = findViewById<NeumorphCardView>(R.id.c_letusc)
        c_letusc.setOnClickListener {
            val intent = Intent(this,C_book_letusc::class.java)
            intent.putExtra("ViewType","assets")
            startActivity(intent)
        }

        val c_thepromlan = findViewById<NeumorphCardView>(R.id.c_thecprolan)
        c_thepromlan.setOnClickListener {
            val intent = Intent(this,C_book_theprolang::class.java)
            intent.putExtra("ViewType","assets")
            startActivity(intent)
        }

        val c_tutorialpoint = findViewById<NeumorphCardView>(R.id.c_tutorialpoint)
        c_tutorialpoint.setOnClickListener {
            val intent = Intent(this,C_book_tutpoint::class.java)
            intent.putExtra("ViewType","assets")
            startActivity(intent)
        }

    }
}


