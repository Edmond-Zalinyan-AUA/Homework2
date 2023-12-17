package com.example.homework_2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.homework_2.contentManager.CityInitializer
import com.example.homework_2.view.compose.CitiesListScreen
import com.example.homework_2.view.compose.WelcomingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val cities = CityInitializer.initCities();
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "WelcomeScreen") {
                composable(route = "WelcomeScreen") {
                    WelcomingScreen(navController = navController)
                }
                composable(route = "CitiesListScreen") {
                    CitiesListScreen(cities = cities, navController = navController)
                }
            }
        }
    }
}

