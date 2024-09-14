package Sem.SEM2.FWP

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.bcaguide.R

class FWP_book : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fwp_book)

        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/1PfieBq7F3DjD3HQJfm3IxhgHQ_vmsEqw/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().javaScriptEnabled = true
        webview.loadUrl(pdf)
    }
}