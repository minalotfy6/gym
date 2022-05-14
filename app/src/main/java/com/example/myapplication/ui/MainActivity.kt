package com.example.myapplication.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

     val UserName = "mina"
     val  password = "1234"
    lateinit var edt_username : EditText
    lateinit var  edt_password : EditText
    lateinit var btn_button : Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edt_username = findViewById(R.id.edt_username)
        edt_password = findViewById(R.id.edt_password)
        btn_button = findViewById(R.id.btn_button)

      btn_button.setOnClickListener {
          if (!edt_username.text.toString().isNullOrEmpty()&& !edt_password.text.toString().isNullOrEmpty())
          {
              if (edt_username.text.toString().equals(UserName) && edt_password.text.toString().equals(password))
              {
                  Toast.makeText(this, "login successful ", Toast.LENGTH_LONG).show()

                  var intent = Intent(this, secondactivity::class.java)
                  intent.putExtra("UserName", edt_username.text.toString())
                  startActivity(intent)
              }

          }


      }


    }


}
