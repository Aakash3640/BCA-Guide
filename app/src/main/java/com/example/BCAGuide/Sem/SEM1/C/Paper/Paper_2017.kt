package Sem.SEM1.C.Paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.firebase.R

class Paper_2017 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.paper_2017)


        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/10A-oRHiMXj9kQramk0_Xfh0XFYxuap8y/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}