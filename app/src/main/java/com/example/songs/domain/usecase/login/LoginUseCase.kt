package com.example.songs.domain.usecase.login

import com.example.songs.data.models.LoginRequestData
import com.example.songs.data.models.LoginResponseData
import com.example.songs.data.models.ResultData
import kotlinx.coroutines.flow.Flow

interface LoginUseCase {

    fun login(body:LoginRequestData):Flow<ResultData<LoginResponseData?>>
}