package Sem.SEM4.DBMS

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class dbms_practical_File : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dbms_practical_file)
        val webview = findViewById<WebView>(R.id.webview)
        webview.clearCache(true)


        val pdf = "https://drive.google.com/file/d/1PD868xcHz6inHHzlZIbzdNrDkIc8840W/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}