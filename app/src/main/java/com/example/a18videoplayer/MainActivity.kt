package com.example.a18videoplayer

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.MediaController
import android.widget.VideoView
import java.util.logging.Level.parse

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.videoView)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        val onlineUri:Uri = Uri.parse("https://media.istockphoto.com/id/994594020/video/rider-in-a-yellow-whitewater-kayak-dropping-a-waterfall.mp4?s=mp4-640x640-is&k=20&c=6Mj3GfJ6a6rvceh-ARvcSWSBoB4zw36f6HAJ5vWdSqQ=")
        val offlineUri:Uri = Uri.parse("android.resource://$packageName/${R.raw.video}")

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(onlineUri)
        //videoView.setVideoURI(offlineUri)
        videoView.requestFocus()
        videoView.start()

    }
}