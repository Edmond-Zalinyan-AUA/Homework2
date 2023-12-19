package com.example.homework_2.contentManager

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.mockito.Mockito.mockStatic
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelperTest {
    @Test
    fun shouldGetRetrofit() {
        val converter = GsonConverterFactory.create()
        mockStatic(GsonConverterFactory::class.java).use { mockedConverter ->
            mockedConverter.`when`<Any> { GsonConverterFactory.create() }.thenReturn(converter)


            val retrofit = RetrofitHelper.getRetrofit()
            assertEquals("https://api.weatherapi.com/", retrofit.baseUrl().toString())
            assertTrue(retrofit.converterFactories().contains(converter))
        }
    }
}