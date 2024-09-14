package Sem.SEM1.C.Notes


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.bcaguide.R


class English_notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.c_notes)


        val webview = findViewById<WebView>(R.id.webview)



        val pdf = "https://drive.google.com/file/d/10cINA_WYu4yOQNitCMtt0q6y056YX6S6/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)

    }


}