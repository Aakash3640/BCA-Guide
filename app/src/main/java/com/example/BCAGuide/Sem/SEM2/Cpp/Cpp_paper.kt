package Sem.SEM2.Cpp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class Cpp_paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cpp_paper)
        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/14-5IanFYL2UQ4ooRUyAk8CojPj3n-7AS/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}