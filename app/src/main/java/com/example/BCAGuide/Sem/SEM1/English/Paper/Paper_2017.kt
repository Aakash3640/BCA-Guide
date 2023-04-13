package Sem.SEM1.English.Paper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

import com.example.firebase.R

class Paper_2017 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_sem1_paper_2017)



        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/10ezfTuhqF4qDTFKPGcLe7i9bYed_qBWI/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)

    }
}