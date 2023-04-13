package Sem.SEM1.C.Notes


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.firebase.R


class C_notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_notes)


        val webview = findViewById<WebView>(R.id.webview)


        val pdf = "https://drive.google.com/file/d/102ndPcOmlcNf3yHQEUeGz5KOZxGir3n/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)

    }


}