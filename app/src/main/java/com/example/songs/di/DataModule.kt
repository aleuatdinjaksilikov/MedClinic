package com.example.songs.di

import com.example.songs.data.network.ApiService
import com.example.songs.data.repository.MainRepositoryImpl
import com.example.songs.domain.repository.MainRepository
import com.example.songs.utils.retrofitBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideApi(client: OkHttpClient): ApiService {
        return retrofitBuilder(
            "https://infycaremed.pythonanywhere.com",
            client = client
        ).create(ApiService::class.java)
    }

    @Provides
    @Singleton
    fun provideOkHttpClient(interceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(interceptor).build()
    }

    @Provides
    @Singleton
    fun provideInterceptor(): HttpLoggingInterceptor {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return interceptor
    }

    @Provides
    @Singleton
    fun mainRepository(apiService: ApiService):MainRepository{
        return MainRepositoryImpl(apiService = apiService)
    }
}