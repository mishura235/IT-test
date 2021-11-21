package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox

class FirstTask : AppCompatActivity() {
    lateinit var next_button1:Button
    lateinit var correct1:CheckBox
    lateinit var incorrect1_1:CheckBox
    lateinit var incorrect1_2:CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_task)
        next_button1 = findViewById(R.id.next_button1)
        correct1 = findViewById(R.id.correct1)
        incorrect1_1 = findViewById(R.id.incorrect1_1)
        incorrect1_2 = findViewById(R.id.incorrect1_2)
        next_button1.setOnClickListener{
            if (correct1.isChecked&&!incorrect1_1.isChecked&&!incorrect1_2.isChecked){
                MainActivity.answers.add(true)
                val intent: Intent = Intent(this,SecondTask::class.java)
                startActivity(intent)
            }else{
                MainActivity.answers.add(false)
                val intent: Intent = Intent(this,SecondTask::class.java)
                startActivity(intent)
            }
        }

    }
}