package com.handroid.dependencyinjectionstart.example_2.di

import com.handroid.dependencyinjectionstart.example_2.presentation.ui.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}