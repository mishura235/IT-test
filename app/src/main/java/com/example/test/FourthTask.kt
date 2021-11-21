package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox

class FourthTask : AppCompatActivity() {
    lateinit var next_button4: Button
    lateinit var correct4: CheckBox
    lateinit var incorrect4_1: CheckBox
    lateinit var incorrect4_2: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth_task)
        next_button4 = findViewById(R.id.next_button4)
        correct4 = findViewById(R.id.correct4)
        incorrect4_1 = findViewById(R.id.incorrect4_1)
        incorrect4_2 = findViewById(R.id.incorrect4_2)
        next_button4.setOnClickListener{
            if (correct4.isChecked&&!incorrect4_1.isChecked&&!incorrect4_2.isChecked){
                MainActivity.answers.add(true)
                val intent = Intent(this,FifthTask::class.java)
                startActivity(intent)
            }else{
                MainActivity.answers.add(false)
                val intent = Intent(this,FifthTask::class.java)
                startActivity(intent)
            }
    }
}

}