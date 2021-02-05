package com.nayan.backgroundservice.service

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import android.provider.Settings

class BackgroundService : Service() {

    private var player: MediaPlayer? =null

    // it will call only once throughout service
    override fun onCreate() {
        super.onCreate()
    }

    //it will call every time service start
    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        player= MediaPlayer.create(this,Settings.System.DEFAULT_RINGTONE_URI)

        //ringtone continously playing
        player?.isLooping
        player?.start()

        //start sticky means service will explicitly started and stopped
        return START_STICKY
    }

    // it will call only once throughout service
    override fun onDestroy() {
        super.onDestroy()
        player?.stop()
    }
    override fun onBind(intent: Intent?): IBinder? {
        TODO("Not yet implemented")
    }
}