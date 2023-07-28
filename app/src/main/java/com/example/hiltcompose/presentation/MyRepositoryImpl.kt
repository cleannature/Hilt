package com.example.hiltcompose.presentation

import com.example.hiltcompose.data.remote.MyApi
import com.example.hiltcompose.domian.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor
    (val api: MyApi
    ): MyRepository {

    override suspend fun doNetwork() {

    }
}