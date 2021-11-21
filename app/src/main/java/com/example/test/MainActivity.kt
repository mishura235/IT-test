package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    companion object {var answers = mutableListOf<Boolean>()}
    lateinit var StartButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        StartButton = findViewById(R.id.buttonStart)
        StartButton.setOnClickListener{
            val intent: Intent = Intent(this,FirstTask::class.java)
            startActivity(intent)
        }
    }
}