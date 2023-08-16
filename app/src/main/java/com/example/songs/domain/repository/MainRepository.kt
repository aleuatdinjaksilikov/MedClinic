package com.example.songs.domain.repository

import com.example.songs.data.models.LoginRequestData
import com.example.songs.data.models.LoginResponseData
import com.example.songs.data.models.ResultData
import kotlinx.coroutines.flow.Flow

interface MainRepository {

    fun login(body:LoginRequestData): Flow<ResultData<LoginResponseData?>>
}