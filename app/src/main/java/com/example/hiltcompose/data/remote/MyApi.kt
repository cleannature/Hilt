package com.example.hiltcompose.data.remote

import retrofit2.http.GET

interface MyApi {
    @GET("test")
    suspend fun doNetwork()
}