package com.example.mitbr

import android.content.IntentFilter
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.app.ActivityCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myReceiver = MyReceiver()
        var myIntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE")


        registerReceiver(myReceiver,myIntentFilter)


        if(ActivityCompat.checkSelfPermission(this, android.Manifest.permission.RECEIVE_SMS)
                == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(this, "PERMISSION GRANTED", Toast.LENGTH_LONG).show()
        }

        else
        {
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.RECEIVE_SMS), 123)
        }
    }
    }
