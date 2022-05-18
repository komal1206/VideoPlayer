package com.example.videoplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import com.example.videoPlayer.R
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val passwordAuthentication : PasswordAuthentication
        val userName : String = "komal"
        val password : String = "komal@123"
        passwordAuthentication(userName: String!, password : String!)
        val videoView : VideoView = findViewById(R.id.VideoView)
        val mediaController : MediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setVideoPath("https://shrikrishnajewels.com/tempor/kirtans/v.mp4")
        videoView.start()
        videoView.setMediaController(mediaController)
    }

    private fun passwordAuthentication(userName: String?, unit: String, password: String, unit1: String) {
        val passwordAuthentication : PasswordAuthentication
        val userName : String = "komal"
        val password : String = "komal@123"
        passwordAuthentication(userName: String!, password : String!)

    }
}