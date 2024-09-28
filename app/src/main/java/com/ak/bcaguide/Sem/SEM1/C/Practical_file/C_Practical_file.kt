package Sem.SEM1.C.Practical_file

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.ak.bcaguide.R

class C_Practical_file : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_practical_file)

                val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/1bjmF6drcTT-RcLKjjn1HtpONf1yUkeaR/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().javaScriptEnabled = true
        webview.loadUrl(pdf)
    }
}