package com.handroid.dependencyinjectionstart.presentation.view_model

import com.handroid.dependencyinjectionstart.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase
) {

    fun method() {
        useCase
    }
}