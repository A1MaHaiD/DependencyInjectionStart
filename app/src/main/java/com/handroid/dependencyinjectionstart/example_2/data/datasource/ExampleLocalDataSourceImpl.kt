package com.handroid.dependencyinjectionstart.example_2.data.datasource

import com.handroid.dependencyinjectionstart.example_2.data.database.ExampleDatabase
import javax.inject.Inject

class ExampleLocalDataSourceImpl @Inject constructor(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }

}