package Sem.SEM5.DMATH

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class D_math_paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.d_math_paper)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1RipygBdf5oNOuJfKRT2I5SG2C4RdPrKT/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}