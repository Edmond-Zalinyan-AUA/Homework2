package com.example.homework_2.common

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

class CityTest {
    @Test
    fun shouldDescribeCapital() {
        val capital = City(name = "City", isCapital = true, country = "Country")
        val actual = capital.description()
        assertEquals("City is the capital of Country. Very beautiful city to live in.", actual)
    }

    @Test
    fun shouldDescribeCapitalWithNoCountry() {
        val capital = City(name = "City", isCapital = true)
        val actual = capital.description()
        assertEquals("Very beautiful city to live in.", actual)
    }

    @Test
    fun shouldDescribeNonCapital() {
        val capital = City(name = "City", isCapital = false, country = "Country")
        val actual = capital.description()
        assertEquals("City is a city located in Country. Very beautiful city to live in.", actual)
    }

    @Test
    fun shouldDescribeUnknownCity() {
        val capital = City()
        val actual = capital.description()
        assertEquals("Unknown city", actual)
    }
}