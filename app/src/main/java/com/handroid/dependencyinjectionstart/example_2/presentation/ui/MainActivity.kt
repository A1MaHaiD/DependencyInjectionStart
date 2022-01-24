package com.handroid.dependencyinjectionstart.example_2.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.handroid.dependencyinjectionstart.R
import com.handroid.dependencyinjectionstart.example_2.di.DaggerApplicationComponent
import com.handroid.dependencyinjectionstart.example_2.presentation.view_model.ExampleViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component = DaggerApplicationComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}