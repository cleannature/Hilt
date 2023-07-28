package com.example.hiltcompose.data.di

import com.example.hiltcompose.data.remote.MyApi
import com.example.hiltcompose.domian.MyRepository
import com.example.hiltcompose.presentation.MyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideApi(): MyApi {
        return Retrofit.Builder()
            .baseUrl("https://Test.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MyApi::class.java)
    }

    @Provides
    @Singleton
    fun provideRepository(api: MyApi): MyRepository{
        return MyRepositoryImpl(api)
    }

}