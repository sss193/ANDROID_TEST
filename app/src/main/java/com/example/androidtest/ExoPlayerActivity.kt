package com.example.androidtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.exoplayer2.ui.PlayerView


class ExoPlayerActivity : AppCompatActivity() {
    private lateinit var playerView: PlayerView
    private lateinit var exoPlayerUtils: ExoPlayerUtils

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exo_player)
        playerView = findViewById(R.id.playerView)
        exoPlayerUtils = ExoPlayerUtils(this, playerView)
    }

    override fun onStart() {
        super.onStart()
        exoPlayerUtils.initPlayer()
    }

    override fun onStop() {
        super.onStop()
        exoPlayerUtils.releasePlayer()
    }

}