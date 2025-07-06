package Sem.SEM1.C.Book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import local.ak.bcaguide.R

class C_book_letusc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_book_letusc)


        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/11Eu7Jgs9I1GSG3uOdUsm1ukDMq40hhP-/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
}}