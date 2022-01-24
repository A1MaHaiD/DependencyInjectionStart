package com.handroid.dependencyinjectionstart.presentation.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.handroid.dependencyinjectionstart.databinding.ActivityMainBinding
import com.handroid.dependencyinjectionstart.di.ContextModule
import com.handroid.dependencyinjectionstart.di.DaggerApplicationComponent
import com.handroid.dependencyinjectionstart.presentation.view_model.ExampleViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent.builder()
            .contextModule(ContextModule(application))
            .build()
    }

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        viewModel.method()
        binding.tvMain.text = "to do: eat, sleep, code, repeat"
    }
}