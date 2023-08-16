package com.example.songs.data.network

import com.example.songs.data.models.LoginRequestData
import com.example.songs.data.models.LoginResponseData
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/api/dj-rest-auth/login/")
    suspend fun login(@Body body:LoginRequestData):Response<LoginResponseData>
}