package com.example.scrollview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val nike=findViewById<ImageView>(R.id.nikeimg)
        nike.setOnClickListener{
            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)

        }
    }
}