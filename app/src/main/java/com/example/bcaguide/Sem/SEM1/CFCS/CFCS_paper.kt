package Sem.SEM1.CFCS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.bcaguide.R

class CFCS_paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.cfcs_paper)
        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/10XA1E9s25odfk8iz_8I6Dlt6SwsQ6UfG/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}