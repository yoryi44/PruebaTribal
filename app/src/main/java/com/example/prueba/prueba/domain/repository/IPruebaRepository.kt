package com.example.prueba.prueba.domain.repository

interface IPruebaRepository {
    suspend fun getCategory() : List<String>
}