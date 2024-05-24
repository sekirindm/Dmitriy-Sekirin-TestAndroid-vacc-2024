package com.example.premierconsultproject.data.network.common

import com.example.premierconsultproject.data.network.model.RetrofitClient
import com.example.premierconsultproject.data.network.service.RetrofitService

object Constants {
    private const val BASE_URL = "https://fakestoreapi.com/"

    val retrofitService: RetrofitService
        get() = RetrofitClient.getClient(BASE_URL).create(RetrofitService::class.java)
}