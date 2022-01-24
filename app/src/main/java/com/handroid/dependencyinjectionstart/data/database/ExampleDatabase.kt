package com.handroid.dependencyinjectionstart.data.database

import android.content.Context
import android.util.Log
import com.handroid.dependencyinjectionstart.R
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)}")
    }

    companion object {
       const val LOG_TAG = "EXAMPLE_TEST"
    }
}