package Sem.SEM3.ISD

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class isd_book : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.isd_book)

        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)

        val pdf = "https://drive.google.com/file/d/1NyoE4YdyQRwHDpw-DbT8nBHYB19A06WS/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}