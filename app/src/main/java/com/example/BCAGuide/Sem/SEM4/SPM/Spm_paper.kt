package Sem.SEM4.SPM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class Spm_paper : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spm_paper)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1EXYFUMfCLBisd32RsOXoSL4VBxFVG5rO/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}