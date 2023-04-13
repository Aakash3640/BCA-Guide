package Sem.SEM3.DS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class ds_practical_file : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ds_practical_file)

        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)

        val pdf = "https://drive.google.com/file/d/1D-HUcMybDJMjR9_fr9xB4k-8zdWIyaeS/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}