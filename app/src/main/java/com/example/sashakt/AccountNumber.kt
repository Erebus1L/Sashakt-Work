package com.example.sashakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_branch_and_bank.*

class AccountNumber : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account_number)
        next.setOnClickListener{
            val intent = Intent(this, IFSCCode::class.java)
            startActivity(intent)
        }
    }
}