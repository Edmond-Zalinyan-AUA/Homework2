package com.example.homework_2.repository

import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("location") val location: LocationResponse,
    @SerializedName("current") val current: CurrentWeatherResponse
)

data class LocationResponse(
    @SerializedName("name") val name: String,
    @SerializedName("region") val region: String,
    @SerializedName("country") val country: String,
)

data class CurrentWeatherResponse(
    @SerializedName("temp_c") val temperature: Float
)

