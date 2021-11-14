package com.example.sashakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_branch_and_bank.*

class BranchAndBank : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_branch_and_bank)

        next.setOnClickListener{
            val intent = Intent(this, AccountNumber::class.java)
            startActivity(intent)
        }
    }
}