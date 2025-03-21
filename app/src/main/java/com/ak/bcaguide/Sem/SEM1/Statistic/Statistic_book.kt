package Sem.SEM1.Statistic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.ak.bcaguide.R

class Statistic_book : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.statistic_book)

        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/10xTpBhEj-Eo7XuukFmm3bsaZoCDlkIoV/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}