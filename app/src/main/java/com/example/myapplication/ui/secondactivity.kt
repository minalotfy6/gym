package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class secondactivity : AppCompatActivity() {
    lateinit var btn_cot: Button
    lateinit var btn_doct: Button
    lateinit var btn_supp: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)

        btn_cot = findViewById(R.id.btn_coach)
        btn_doct = findViewById(R.id.btn_doctor)
        btn_supp = findViewById(R.id.btn_supplements)
        btn_cot.setOnClickListener {
            var intent = Intent(this, coach::class.java)
            startActivity(intent)
        }
        btn_doct.setOnClickListener {
            var intent = Intent(this, doctor::class.java)
            startActivity(intent)
        }
        btn_supp.setOnClickListener {
            var intent = Intent(this, supplements::class.java)
            startActivity(intent)
        }
    }
}
