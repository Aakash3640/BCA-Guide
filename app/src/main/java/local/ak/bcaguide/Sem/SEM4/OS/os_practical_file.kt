package Sem.SEM4.OS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import local.ak.bcaguide.R

class os_practical_file : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.os_practical_file)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1PQj7-XuPzYk7JVDeuCfkiqOUU_AHOUs9/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}