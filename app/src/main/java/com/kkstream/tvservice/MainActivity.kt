package com.kkstream.tvservice

import android.content.IntentFilter
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkstream.tvservice.receiver.HDMIStateReceiver

class MainActivity : AppCompatActivity() {

    private val hdmiStateReceiver = HDMIStateReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val intentFilter = IntentFilter(AudioManager.ACTION_HDMI_AUDIO_PLUG)
        registerReceiver(hdmiStateReceiver, intentFilter)
    }

    override fun onDestroy() {
        unregisterReceiver(hdmiStateReceiver)
        super.onDestroy()
    }
}