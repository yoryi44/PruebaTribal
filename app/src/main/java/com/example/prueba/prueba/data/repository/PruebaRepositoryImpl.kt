package com.example.prueba.prueba.data.repository

import com.example.prueba.prueba.data.remote.PruebaApi
import com.example.prueba.prueba.domain.repository.IPruebaRepository

class PruebaRepositoryImpl(
    private val pruebaApi: PruebaApi
) : IPruebaRepository {

    override suspend fun getCategory(): List<String> {
        return pruebaApi.getCategory()
    }
}