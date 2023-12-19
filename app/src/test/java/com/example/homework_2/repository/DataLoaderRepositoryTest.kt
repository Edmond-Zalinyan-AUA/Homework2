package com.example.homework_2.repository

import com.example.homework_2.common.City
import com.example.homework_2.contentManager.WeatherApiService
import kotlinx.coroutines.runBlocking
import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.mockito.Mockito.mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.Mockito.`when`

class DataLoaderRepositoryTest {


    @Test
    fun shouldReturnWeatherResponse(): Unit = runBlocking {
        val city = City(name = "CityTest")
        val current = CurrentWeatherResponse(temperature = 20F)
        val location =
            LocationResponse(name = "CityTest", region = "TestREgion", country = "TestCountry")
        val repo = DataLoaderRepository()
        val apiService = mock(WeatherApiService::class.java)
        repo.apiService = apiService

        val expectedWeatherResponse = WeatherResponse(current = current, location = location)
        `when`(
            apiService.fetchWeather(
                query = city.name.orEmpty(),
                apiKey = "30a25da9a45044f68b8190050231712"
            )
        )
            .thenReturn(expectedWeatherResponse)
        val response = repo.loadWeather(city)

        verify(apiService, times(1)).fetchWeather(
            query = city.name.orEmpty(),
            apiKey = "30a25da9a45044f68b8190050231712"
        )
        assertEquals(expectedWeatherResponse, response)
    }
}