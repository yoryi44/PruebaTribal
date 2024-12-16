package com.example.prueba.prueba.domain.usecase

import com.example.prueba.prueba.domain.repository.IPruebaRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class GetCategoryUseCase(
    private val repository: IPruebaRepository
)
{
    suspend operator fun invoke() = withContext(Dispatchers.IO) {
        repository.getCategory()
    }
}
