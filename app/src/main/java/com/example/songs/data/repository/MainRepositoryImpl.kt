package com.example.songs.data.repository

import com.example.songs.data.models.LoginRequestData
import com.example.songs.data.models.LoginResponseData
import com.example.songs.data.models.ResultData
import com.example.songs.data.network.ApiService
import com.example.songs.domain.repository.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepositoryImpl @Inject constructor(private val apiService: ApiService):MainRepository {

    override fun login(body: LoginRequestData)= flow {
        val response = apiService.login(body = body)
        if (response.isSuccessful){
            emit(ResultData.Success(response.body()))
        }else{
            emit(ResultData.Message(response.message()))
        }
    }.catch { emit(ResultData.Error(it)) }.flowOn(Dispatchers.IO)
}