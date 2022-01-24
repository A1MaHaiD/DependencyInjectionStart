package com.handroid.dependencyinjectionstart.di

import com.handroid.dependencyinjectionstart.data.datasource.ExampleLocalDataSource
import com.handroid.dependencyinjectionstart.data.datasource.ExampleLocalDataSourceImpl
import com.handroid.dependencyinjectionstart.data.datasource.ExampleRemoteDataSource
import com.handroid.dependencyinjectionstart.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}