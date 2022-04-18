package com.example.sashakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_choose_one_action.*


class ChooseOneAction : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose_one_action)

        TeachOption.setOnClickListener{
            val intent= Intent(this, TeachingInstructions::class.java)
            startActivity(intent)
        }
        SellOption.setOnClickListener {
            val intent = Intent(this, SellingInstructions::class.java)
            startActivity(intent)
        }
        balance.setOnClickListener {
            val intent = Intent(this, CurrentEarnings::class.java)
            startActivity(intent)
        }
    }
}
