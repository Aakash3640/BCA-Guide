package Sem.SEM2.English_Sem2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import com.example.firebase.R

class English_notes_sem2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.english_notes_sem2)
        val webview = findViewById<WebView>(R.id.webview)

        val pdf = "https://drive.google.com/file/d/16VedVV0l6TlOK_Gllp1dgfrpS6hZuhX4/view?usp=drivesdk"
        webview.getSettings().setSupportZoom(true)
        webview.getSettings().setJavaScriptEnabled(true)
        webview.loadUrl(pdf)
    }
}