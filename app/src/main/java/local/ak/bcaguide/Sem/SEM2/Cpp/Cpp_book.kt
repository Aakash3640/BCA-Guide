package Sem.SEM2.Cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import local.ak.bcaguide.R

class Cpp_book : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpp_book)

        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/13fShPYLF7AO-TaHw_JR_YVBFbg-_styB/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}