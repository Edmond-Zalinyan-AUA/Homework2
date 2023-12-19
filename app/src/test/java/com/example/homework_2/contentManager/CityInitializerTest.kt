package com.example.homework_2.contentManager

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Assertions.assertFalse
import com.example.homework_2.R

class CityInitializerTest {

    @Test
    fun shouldInitializeHardcodedCities() {
        val cities = CityInitializer.initCities()
        assertEquals(4, cities.size)
        assertEquals("Yerevan", cities[0].name)
        assertTrue(cities[0].isCapital!!)
        assertEquals("Armenia", cities[0].country)
        assertEquals(R.mipmap.yerevan, cities[0].image)

        assertEquals("Washington", cities[1].name)
        assertTrue(cities[1].isCapital!!)
        assertEquals("USA", cities[1].country)
        assertEquals(R.mipmap.washington, cities[1].image)

        assertEquals("London", cities[2].name)
        assertTrue(cities[2].isCapital!!)
        assertEquals("England", cities[2].country)
        assertEquals(R.mipmap.london, cities[2].image)

        assertEquals("Saint Petersburg", cities[3].name)
        assertFalse(cities[3].isCapital!!)
        assertEquals("Russia", cities[3].country)
        assertEquals(R.mipmap.saint_petersburg, cities[3].image)

    }
}