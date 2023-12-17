package com.example.homework_2.contentManager

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.weatherapi.com")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}