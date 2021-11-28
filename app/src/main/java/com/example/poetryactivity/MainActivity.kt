package com.example.poetryactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    private var TAG: String = "Poetry"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "Ты видел деву на скале")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "В одежде белой над волнами")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Когда, бушуя в бурной мгле,")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Играло море с берегами,")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Когда луч молний озарял")
    }

    override fun onDestroy() {
        Log.d(TAG, "Ее всечасно блеском алым")
        super.onDestroy()
    }
}