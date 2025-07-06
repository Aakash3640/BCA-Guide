package Sem.SEM1.Statistic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class Statistic_paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistic_paper)

        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/10ruXdfvX3L3k5wIlveCLqq9-W31w81OE/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}