package Sem.SEM1.C.Practical_file

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.firebase.R

class C_Practical_file : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_practical_file)

                val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/104lqq4RRJhMxAM_xkXJNT4lGA1q8IkX3/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}