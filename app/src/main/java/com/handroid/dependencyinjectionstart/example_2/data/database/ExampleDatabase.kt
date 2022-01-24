package com.handroid.dependencyinjectionstart.example_2.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDatabase @Inject constructor() {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase")
    }

    companion object {
        private const val LOG_TAG = "EXAMPLE_TEST"
    }
}