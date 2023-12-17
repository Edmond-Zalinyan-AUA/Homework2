package com.example.homework_2.contentManager

import com.example.homework_2.common.City

class CityInitializer {
    companion object {
        fun initCities(): List<City> {
            val city1 = City(
                name = "Yerevan",
                isCapital = true,
                country = "Armenia",
            );
            val city2 = City(
                name = "Washington",
                isCapital = true,
                country = "USA",
            );
            val city3 = City(
                name = "London",
                isCapital = true,
                country = "England",
            );
            val city4 = City(
                name = "Hrazdan",
                isCapital = false,
                country = "Armenia",
            );
            return listOf(city1, city2, city3, city4);
        }
    }
}