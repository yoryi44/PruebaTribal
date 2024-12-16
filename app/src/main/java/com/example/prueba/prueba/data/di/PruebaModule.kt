package com.example.prueba.prueba.data.di

import com.example.prueba.prueba.data.remote.PruebaApi
import com.example.prueba.prueba.data.repository.PruebaRepositoryImpl
import com.example.prueba.prueba.domain.repository.IPruebaRepository
import com.example.prueba.prueba.domain.usecase.GetCategoryUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object PruebaModule {


    @Provides
    @Singleton
    fun providePruebaRepository(pruebaApi: PruebaApi) : IPruebaRepository
    {
        return PruebaRepositoryImpl(pruebaApi)
    }

    @Provides
    @Singleton
    fun provideGetCategoryUseCase(repository: IPruebaRepository) : GetCategoryUseCase {
        return GetCategoryUseCase(repository)
    }

    @Provides
    @Singleton
    fun providePruebaApi() =
        Retrofit.Builder().baseUrl("https://api.chucknorris.io/jokes/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PruebaApi::class.java)

}