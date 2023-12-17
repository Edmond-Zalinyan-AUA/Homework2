package com.example.homework_2.contentManager

import com.example.homework_2.common.City
import com.example.homework_2.repository.WeatherResponse

class DataLoader {
     suspend fun loadWeather(city: City): WeatherResponse {
         val apiService = RetrofitHelper.getRetrofit().create(WeatherApiService::class.java)
        city.temperature = apiService.fetchWeather(
            city.name.orEmpty(),
            "30a25da9a45044f68b8190050231712"
        ).current.temperature

        return apiService.fetchWeather(city.name.orEmpty(), "30a25da9a45044f68b8190050231712")
    }
}