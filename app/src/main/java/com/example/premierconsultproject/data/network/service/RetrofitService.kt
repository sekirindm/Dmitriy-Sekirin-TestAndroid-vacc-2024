package com.example.premierconsultproject.data.network.service

import com.example.premierconsultproject.data.network.model.Products
import retrofit2.http.GET

interface RetrofitService {
    @GET("products")
    suspend fun getRequest(): List<Products>
}