package com.example.mitbr

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        Log.i("mytag", "AIR PLANE MODE ....")
        var myIntent = Intent(context, MainActivity::class.java)
        myIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(myIntent)
    }

}