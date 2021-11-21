package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox

class FifthTask : AppCompatActivity() {
    lateinit var next_button5: Button
    lateinit var correct5: CheckBox
    lateinit var incorrect5_1: CheckBox
    lateinit var incorrect5_2: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth_task)
        next_button5 = findViewById(R.id.next_button5)
        correct5 = findViewById(R.id.correct5)
        incorrect5_1 = findViewById(R.id.incorrect5_1)
        incorrect5_2 = findViewById(R.id.incorrect5_2)
        next_button5.setOnClickListener{
            if (correct5.isChecked&&!incorrect5_1.isChecked&&!incorrect5_2.isChecked){
                MainActivity.answers.add(true)
                val intent = Intent(this,FinishActivity::class.java)
                startActivity(intent)
            }else{
                MainActivity.answers.add(false)
                val intent = Intent(this,FinishActivity::class.java)
                startActivity(intent)
            }


    }
}
}