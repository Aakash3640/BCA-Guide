package Sem.SEM2.Cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import local.ak.bcaguide.R

class Cpp_Practical_file : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpp_practical_file)
        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/16OFV98xR0MBEFZLPPoYitPvC2ZSFXKbg/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}