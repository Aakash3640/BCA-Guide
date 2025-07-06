package Sem.SEM2.Cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class Cpp_Notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpp_notes)
        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/16N_jxDs5utOYdgIytJghqm_9rKnV7BhB/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}