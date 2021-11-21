package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinishActivity : AppCompatActivity() {
    lateinit var res:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        res = findViewById(R.id.result)
        var correct:Int = 0
        for (i in MainActivity.answers){
            if(i == true){
                correct++
            }
        }
        res.text = "$correct/5"
    }
}