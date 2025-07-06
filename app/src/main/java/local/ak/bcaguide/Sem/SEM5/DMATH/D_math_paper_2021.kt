package local.ak.bcaguide.Sem.SEM5.DMATH

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

import local.ak.bcaguide.R

class D_math_paper_2021 : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dmath_paper2021)

        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1VOFgIYCiGYVKh3emELayzvhooDxX_IdS/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().javaScriptEnabled = true
        webview.loadUrl(pdf)

    }
}