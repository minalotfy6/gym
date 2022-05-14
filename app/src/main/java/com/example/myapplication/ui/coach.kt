package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.R

class coach : AppCompatActivity() {
    lateinit var btn_fit : Button
    lateinit var btn_buld :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_coach)
        btn_fit = findViewById(R.id.fitnes)
        btn_buld = findViewById(R.id.building)
        btn_fit.setOnClickListener {
            var intent =Intent(this, fit::class.java)
            startActivity(intent)
        }
        btn_buld.setOnClickListener {
            var intent = Intent(this, building::class.java)
            startActivity(intent)
        }
    }
}
