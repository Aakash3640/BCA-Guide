package Sem.SEM1.English.Paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class Paper_2020 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_sem1_paper_2020)


        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/10cBgAWxCOAmkwYyiKjaB7OyLXum19oJH/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
        
    }
}