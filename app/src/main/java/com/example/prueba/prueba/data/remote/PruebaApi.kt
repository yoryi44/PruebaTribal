package com.example.prueba.prueba.data.remote

import retrofit2.http.GET

interface PruebaApi {


    @GET("categories")
    suspend fun getCategory() : List<String>

}