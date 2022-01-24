package com.handroid.dependencyinjectionstart.example_2.presentation.view_model

import com.handroid.dependencyinjectionstart.example_2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase
    }
}