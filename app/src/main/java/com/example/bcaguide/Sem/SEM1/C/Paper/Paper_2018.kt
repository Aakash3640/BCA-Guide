package Sem.SEM1.C.Paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.bcaguide.R

class Paper_2018 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paper_2018)

        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/10GO4Yjl4y-nuL3cpugpGnpCD-1VaNzPH/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}