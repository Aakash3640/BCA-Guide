package Sem.SEM1.English.Paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.bcaguide.R
import soup.neumorphism.NeumorphCardView

class English_Paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_paper)

        val english_2017 = findViewById<NeumorphCardView>(R.id.english_2017)
        english_2017.setOnClickListener {
            startActivity(Intent(this,Paper_2017::class.java))
        }

        val english_2020 = findViewById<NeumorphCardView>(R.id.english_2020)
        english_2020.setOnClickListener {
            startActivity(Intent(this,Paper_2020::class.java))
        }
    }
}