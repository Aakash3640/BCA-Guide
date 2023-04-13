package Sem.SEM3.DS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class ds_notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ds_notes)

        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)

        val pdf = "https://drive.google.com/file/d/1CZrSeRjW-KENkjoKCa0HTIvjXnZK8kuP/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}