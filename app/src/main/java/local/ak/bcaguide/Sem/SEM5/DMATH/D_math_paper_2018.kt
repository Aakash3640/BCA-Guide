package Sem.SEM5.DMATH

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class D_math_paper_2018 : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.d_math_paper)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1KfHVWTyr1qS6WkfYBIUt0Gk2zNJLULAn/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().javaScriptEnabled = true
        webview.loadUrl(pdf)
    }
}