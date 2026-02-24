package br.com.jpegsinng.videoplayer

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import br.com.jpegsinng.videoplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val videoView = binding.videoView
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val uri: Uri = ("android.resource://" + packageName
                + "/raw/videosample").toUri()
        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.start()
    }
}