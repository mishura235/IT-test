package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class SecondTask : AppCompatActivity() {
    lateinit var next_button2: Button
    lateinit var correct2: CheckBox
    lateinit var incorrect2_1: CheckBox
    lateinit var incorrect2_2: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_task)
        next_button2 = findViewById(R.id.next_button2)
        correct2 = findViewById(R.id.correct2)
        incorrect2_1 = findViewById(R.id.incorrect2_1)
        incorrect2_2 = findViewById(R.id.incorrect2_2)
        next_button2.setOnClickListener{
            if (correct2.isChecked&&!incorrect2_1.isChecked&&!incorrect2_2.isChecked){
                MainActivity.answers.add(true)
                val intent = Intent(this,ThirdTask::class.java)
                startActivity(intent)
            }else{
                MainActivity.answers.add(false)
                val intent = Intent(this,ThirdTask::class.java)
                startActivity(intent)
            }
        }


    }
}