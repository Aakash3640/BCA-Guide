package Sem.SEM1.C.Paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.bcaguide.R

class Paper_2020dec : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paper_2020dec)

        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/10Gl2-A6VfB-G1-Uilb-F7QO7R58roMNl/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}