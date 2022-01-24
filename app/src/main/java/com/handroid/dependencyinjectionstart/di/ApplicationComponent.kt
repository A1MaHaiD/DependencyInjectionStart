package com.handroid.dependencyinjectionstart.di

import com.handroid.dependencyinjectionstart.presentation.ui.MainActivity
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class, ContextModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}