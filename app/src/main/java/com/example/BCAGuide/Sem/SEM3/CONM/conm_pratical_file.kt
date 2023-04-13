package Sem.SEM3.CONM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class conm_pratical_file : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.conm_pratical_file)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1O2LR2U8Ftk-PdZkyQcp2FKYaj38L9dls/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}