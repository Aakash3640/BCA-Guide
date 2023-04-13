package com.example.BCAGuide

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import com.example.firebase.R
import kotlinx.android.synthetic.main.activity_phone_mainf.*



class Phone_Mainf : AppCompatActivity() {

    private var spinner: Spinner? = null
    private var editext: EditText? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phone_mainf)

        spinner = findViewById(R.id.spin)
        editext = findViewById(R.id.phone)

        spinner!!.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_dropdown_item,countrydata.countryname)

        next.setOnClickListener {
            val code = countrydata.countryareacode[spinner!!.selectedItemPosition]
            val number = editext!!.text.toString()
            if(number.isEmpty()||number.length<10){
                Toast.makeText(this,"Invalid Number",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val phnum = "+$code$number"
            val intent = Intent(this,PhoneVerifyf::class.java)
            intent.putExtra("phone",phnum)
            startActivity(intent)

        }
    }
}