package Sem.SEM1.C.Book

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.firebase.R

class C_book_tutpoint : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_book_tutpoint)


        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/10ZpVEorpjkdfebEiEOKcTiLRGlr71PlM/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)

    }
}