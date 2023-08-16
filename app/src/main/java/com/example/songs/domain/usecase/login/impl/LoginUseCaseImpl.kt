package com.example.songs.domain.usecase.login.impl

import com.example.songs.data.models.LoginRequestData
import com.example.songs.data.models.LoginResponseData
import com.example.songs.data.models.ResultData
import com.example.songs.domain.repository.MainRepository
import com.example.songs.domain.usecase.login.LoginUseCase
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LoginUseCaseImpl @Inject constructor(private val mainRepository: MainRepository):LoginUseCase {
    override fun login(body: LoginRequestData): Flow<ResultData<LoginResponseData?>> {
        return mainRepository.login(body = body)
    }
}