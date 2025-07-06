package Sem.SEM3.ISD

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class isd_paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isd_paper)

        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)

        val pdf = "https://drive.google.com/file/d/1NzS2fV5DyytHW53pxbZGM_X6MvzhRQg6/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}