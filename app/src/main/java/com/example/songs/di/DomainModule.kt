package com.example.songs.di

import com.example.songs.domain.usecase.login.LoginUseCase
import com.example.songs.domain.usecase.login.impl.LoginUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class DomainModule {

    @Binds
    abstract fun loginUseCase(loginUseCaseImpl: LoginUseCaseImpl):LoginUseCase
}