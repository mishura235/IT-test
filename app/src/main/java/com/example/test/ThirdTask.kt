package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class ThirdTask : AppCompatActivity() {
    lateinit var next_button3: Button
    lateinit var correct3: CheckBox
    lateinit var incorrect3_1: CheckBox
    lateinit var incorrect3_2: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_task)
        next_button3 = findViewById(R.id.next_button3)
        correct3 = findViewById(R.id.correct3)
        incorrect3_1 = findViewById(R.id.incorrect3_1)
        incorrect3_2 = findViewById(R.id.incorrect3_2)
        next_button3.setOnClickListener{
            if (correct3.isChecked&&!incorrect3_1.isChecked&&!incorrect3_2.isChecked){
                MainActivity.answers.add(true)
                val intent = Intent(this,FourthTask::class.java)
                startActivity(intent)
            }else{
                MainActivity.answers.add(false)
                val intent = Intent(this,FourthTask::class.java)
                startActivity(intent)
            }
        }
    }
}