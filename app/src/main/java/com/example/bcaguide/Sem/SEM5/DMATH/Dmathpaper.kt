package com.example.bcaguide.Sem.SEM5.DMATH


import Sem.SEM5.DMATH.D_math_paper_2018
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class Dmathpaper : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dmathpaper)

        val math_2018 = findViewById<NeumorphCardView>(R.id.math_2018)
        math_2018.setOnClickListener {
            startActivity(Intent(this, D_math_paper_2018::class.java))
        }

        val math_2021 = findViewById<NeumorphCardView>(R.id.math_2021)
        math_2021.setOnClickListener {
            startActivity(Intent(this, D_math_paper_2021::class.java))
        }
    }
}