package com.handroid.dependencyinjectionstart.di

import com.handroid.dependencyinjectionstart.data.repository.ExampleRepositoryImpl
import com.handroid.dependencyinjectionstart.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}