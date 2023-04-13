package Sem.SEM1.C.Paper

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.firebase.R
import soup.neumorphism.NeumorphCardView

class C_papers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_papers)


        val paper2017 = findViewById<NeumorphCardView>(R.id.paper2017)
        val paper2018 = findViewById<NeumorphCardView>(R.id.paper2018)

        val paper2020dec = findViewById<NeumorphCardView>(R.id.paper2020dec)




        paper2017.setOnClickListener {
            val intent = Intent(this, Paper_2017::class.java)
            startActivity(intent)
        }
        paper2018.setOnClickListener {
            val intent = Intent(this, Paper_2018::class.java)
            startActivity(intent)
        }


        paper2020dec.setOnClickListener {
            val intent = Intent(this, Paper_2020dec::class.java)
            startActivity(intent)

    }
}

}