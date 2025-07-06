package Sem.SEM3.CONM

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class conm_pratical_file : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conm_pratical_file)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1PPj-g28zOHlBEWHWHwVe35XmetvupFfb/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().javaScriptEnabled = true
        webview.loadUrl(pdf)
    }
}