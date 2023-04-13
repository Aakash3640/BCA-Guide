package com.example.BCAGuide

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.firebase.R
import com.github.barteksc.pdfviewer.PDFView

class Syllabus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.syllabus)

        val pdf = findViewById<PDFView>(R.id.pdfviewer)
        pdf.fromAsset("BCA Syllabus 2019-20.pdf")
            .swipeHorizontal(false)
            .defaultPage(0)
            .load()
    }
}