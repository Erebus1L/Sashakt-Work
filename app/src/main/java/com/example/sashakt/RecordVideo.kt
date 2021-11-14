package com.example.sashakt

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_record_video.*

class RecordVideo : AppCompatActivity() {

    private var ourRequestCode:Int = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_record_video)


        val mediaCollection=MediaController(this)
        mediaCollection.setAnchorView(videoView)
        videoView.setMediaController(mediaCollection)
    }
    override fun onActivityResult(requestCode :Int, resultCode: Int, data:Intent?){
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==ourRequestCode && resultCode== RESULT_OK){
            val videoUri = data?.data
            videoView.setVideoURI(videoUri)
            videoView.start()
        }
    }
    fun startVideo(view: android.view.View) {
        val intent = Intent(MediaStore.ACTION_VIDEO_CAPTURE)
        if (intent.resolveActivity(packageManager) != null){
            startActivityForResult(intent, ourRequestCode)
        }
    }
     val REQUEST_VIDEO_CAPTURE = 1

    //Another method
    fun dispatchTakeVideoIntent(view: android.view.View) {
        Intent(MediaStore.ACTION_VIDEO_CAPTURE).also { takeVideoIntent ->
            takeVideoIntent.resolveActivity(packageManager)?.also {
                startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE)
            }
        }
    }

}