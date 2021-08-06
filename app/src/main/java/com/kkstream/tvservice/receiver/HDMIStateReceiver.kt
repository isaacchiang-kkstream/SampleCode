package com.kkstream.tvservice.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.AudioManager
import android.util.Log

class HDMIStateReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action
        if (AudioManager.ACTION_HDMI_AUDIO_PLUG == action) {
            val isConnected = intent.getIntExtra(AudioManager.EXTRA_AUDIO_PLUG_STATE, 0)
            if (isConnected == 0) {
                Log.d("Zaccc", "HDMI disconnect")
            } else {
                Log.d("Zaccc", "HDMI is connected")
            }
        }
    }
}