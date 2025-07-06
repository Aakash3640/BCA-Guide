package Sem.SEM2.CO

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class Co_notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.co_notes)
        val webview = findViewById<WebView>(R.id.webview)



        val pdf = "https://drive.google.com/file/d/16_-LZ8RWvYT5prRGbTNbqunMhC80X0KH/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }

}