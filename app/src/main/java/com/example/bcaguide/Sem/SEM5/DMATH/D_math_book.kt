package Sem.SEM5.DMATH

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.bcaguide.R

class D_math_book : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.d_math_book)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1iyZicbEFBZ1XmuJV4VGJYc7hLNJacXSF/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().javaScriptEnabled = true
        webview.loadUrl(pdf)
    }
}