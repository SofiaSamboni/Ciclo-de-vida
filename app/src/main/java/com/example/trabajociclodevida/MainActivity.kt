package com.example.trabajociclodevida

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStartCalled")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d ("MainActivity", "Oncreate Called PRUEBA DE SIRVE")
        setContentView(R.layout.activity_main)
    }

    override fun onResume () {
        super.onResume()
        Log.d(TAG, "onResume Called")
    }

    override fun onPause (){
        super.onPause()
        Log.d(TAG, "onPause Called")
    }

    override fun onStop () {
        super.onStop()
        Log.d(TAG, "onStop Called")
    }


    override fun onDestroy () {
        super.onDestroy()
        Log.d(TAG, "onDestroy Called")
    }

    override fun onRestart () {
        super.onRestart()
        Log.d(TAG, "onRestart Called")
    }

}