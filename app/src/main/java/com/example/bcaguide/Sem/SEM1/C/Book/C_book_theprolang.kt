package Sem.SEM1.C.Book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.bcaguide.R

class C_book_theprolang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_book_theprolang)


        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/10yrBkO9eXJqitVBWG7pX285nhzZR1Vie/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)


    }
}