package Sem.SEM3.HCP

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class hcp_paper_sem3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hcp_paper_sem3)


        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)

        val pdf = "https://drive.google.com/file/d/1ChMOTzXHh3BarbcXclPUwZQLSCvmLIeW/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}