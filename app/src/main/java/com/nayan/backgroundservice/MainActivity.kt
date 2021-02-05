package com.nayan.backgroundservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.nayan.backgroundservice.service.BackgroundService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startService(view: View) {
        intent= Intent(this,BackgroundService::class.java)
        //to start service
        startService(intent)
    }
    fun stopService(view: View) {
        intent= Intent(this,BackgroundService::class.java)
        //to stop service
        stopService(intent)
    }
}

//it will runs in background even if we go to another app and does not show notification