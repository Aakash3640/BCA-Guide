package local.ak.bcaguide.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import local.ak.bcaguide.R

import com.blogspot.atifsoftwares.animatoolib.Animatoo
import local.ak.bcaguide.Loginf


class Flash_screen : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.flash_screen)


        supportActionBar?.hide()

        Handler(Looper.getMainLooper()).postDelayed({
            val i = Intent(this,Loginf::class.java)
            startActivity(i)
            Animatoo.animateInAndOut(this)
        },2000)





    }



}