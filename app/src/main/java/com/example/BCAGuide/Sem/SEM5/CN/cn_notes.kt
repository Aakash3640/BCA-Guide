package Sem.SEM5.CN

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class cn_notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cn_notes)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1RvVBra46o8oqkDm-lqK49gqXUxz2Wqp-/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}