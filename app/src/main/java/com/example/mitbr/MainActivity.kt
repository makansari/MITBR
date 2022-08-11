package com.example.mitbr

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myReceiver = MyReceiver()
        var myIntentFilter = IntentFilter()
        myIntentFilter.addAction("android.intent.action.AIRPLANE_MODE")

        registerReceiver(myReceiver,myIntentFilter)
    }
}