package com.handroid.dependencyinjectionstart.example_2.di

import com.handroid.dependencyinjectionstart.example_2.data.datasource.ExampleLocalDataSource
import com.handroid.dependencyinjectionstart.example_2.data.datasource.ExampleLocalDataSourceImpl
import com.handroid.dependencyinjectionstart.example_2.data.datasource.ExampleRemoteDataSource
import com.handroid.dependencyinjectionstart.example_2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Module
import dagger.Provides

@Module
class DataModule {

    @Provides
    fun provideLocalDataSource(implData: ExampleLocalDataSourceImpl): ExampleLocalDataSource {
        return implData
    }

    @Provides
    fun provideRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource {
        return impl
    }
}