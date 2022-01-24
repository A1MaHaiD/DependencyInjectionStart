package com.handroid.dependencyinjectionstart.data.repository

import com.handroid.dependencyinjectionstart.data.datasource.ExampleLocalDataSource
import com.handroid.dependencyinjectionstart.data.datasource.ExampleRemoteDataSource
import com.handroid.dependencyinjectionstart.data.mapper.ExampleMapper
import com.handroid.dependencyinjectionstart.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl @Inject constructor(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper
) : ExampleRepository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}