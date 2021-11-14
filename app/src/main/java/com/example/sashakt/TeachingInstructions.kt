package com.example.sashakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_teaching_instructions.*

class TeachingInstructions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teaching_instructions)

        readyButton.setOnClickListener{
            val intent= Intent(this, RecordVideo::class.java)
            startActivity(intent)
        }
    }
}