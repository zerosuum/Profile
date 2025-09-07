package com.example.profile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.progressindicator.LinearProgressIndicator
import com.example.profile.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<LinearProgressIndicator>(R.id.sksProgress)
            .setProgressCompat(50, true)
    }
}