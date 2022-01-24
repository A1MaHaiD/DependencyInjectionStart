package com.handroid.dependencyinjectionstart.example_2.data.datasource

import com.handroid.dependencyinjectionstart.example_2.data.network.ExampleApiService
import javax.inject.Inject

class ExampleRemoteDataSourceImpl @Inject constructor(
    private val apiService: ExampleApiService
) : ExampleRemoteDataSource {

    override fun method() {
        apiService.method()
    }
}