package com.handroid.dependencyinjectionstart.example_2.di

import com.handroid.dependencyinjectionstart.example_2.data.repository.ExampleRepositoryImpl
import com.handroid.dependencyinjectionstart.example_2.domain.ExampleRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideRepository(impl: ExampleRepositoryImpl): ExampleRepository {
        return impl
    }
}