package Sem.SEM2.CO

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.bcaguide.R

class Co_paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.co_paper)
        val webview = findViewById<WebView>(R.id.webview)

        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/16YebW5euogziepUydBNGtgFmFQhcNl_A/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}