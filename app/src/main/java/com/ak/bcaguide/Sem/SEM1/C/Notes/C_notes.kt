package Sem.SEM1.C.Notes


import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.ak.bcaguide.R


class C_notes : AppCompatActivity() {

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_notes)


        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/102ndPcOmIcNf3yHQEUeGz5KOZXeGir3n/view?usp=sharing"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().javaScriptEnabled = true
        webview.loadUrl(pdf)

    }


}