package com.example.sashakt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        val topAnim: Animation
        val botAnim: Animation
        botAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation)
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation)
        val image: ImageView =findViewById(R.id.logo)
        image.animation=topAnim
        val name: TextView =findViewById(R.id.name)
        name.animation=botAnim
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        Handler().postDelayed({
            val intent= Intent(this, ChooseOneAction::class.java)
            startActivity(intent)
            finish()
        }, 2000)
    }
}