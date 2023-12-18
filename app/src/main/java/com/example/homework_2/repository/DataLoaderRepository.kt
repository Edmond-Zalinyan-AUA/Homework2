package com.example.homework_2.repository

import com.example.homework_2.common.City
import com.example.homework_2.contentManager.RetrofitHelper
import com.example.homework_2.contentManager.WeatherApiService

class DataLoaderRepository {
    private val apiKey = "30a25da9a45044f68b8190050231712"
    suspend fun loadWeather(city: City): WeatherResponse {
        val apiService = RetrofitHelper.getRetrofit().create(WeatherApiService::class.java)
        return apiService.fetchWeather(city.name.orEmpty(), apiKey)
    }
}