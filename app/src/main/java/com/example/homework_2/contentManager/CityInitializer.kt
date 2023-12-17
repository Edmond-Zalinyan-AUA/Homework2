package com.example.homework_2.contentManager

import com.example.homework_2.R
import com.example.homework_2.common.City

class CityInitializer {
    companion object {
        fun initCities(): List<City> {
            val city1 = City(
                name = "Yerevan",
                isCapital = true,
                country = "Armenia",
                image = R.mipmap.yerevan
            );
            val city2 = City(
                name = "Washington",
                isCapital = true,
                country = "USA",
                image = R.mipmap.washington
            );
            val city3 = City(
                name = "London",
                isCapital = true,
                country = "England",
                image = R.mipmap.london
            );
            val city4 = City(
                name = "Saint Petersburg",
                isCapital = false,
                country = "Russia",
                image = R.mipmap.saint_petersburg
            );
            return listOf(city1, city2, city3, city4);
        }
    }
}