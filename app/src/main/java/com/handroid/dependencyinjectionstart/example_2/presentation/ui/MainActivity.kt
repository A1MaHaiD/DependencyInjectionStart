package com.handroid.dependencyinjectionstart.example_2.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.handroid.dependencyinjectionstart.R
import com.handroid.dependencyinjectionstart.example_1.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.computer.toString()
    }
}