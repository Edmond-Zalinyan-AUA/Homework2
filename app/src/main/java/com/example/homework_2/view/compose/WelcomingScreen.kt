package com.example.homework_2.view.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun WelcomingScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Welcoming()
        Button(onClick = { navController.navigate("CitiesListScreen") }) {
            Text(text = "Explore!")
        }
    }
}

@Composable
fun Welcoming(modifier: Modifier = Modifier) {
    Text(
        text = "Welcome to the Cities!",
        modifier = modifier.padding(15.dp),
        fontSize = 35.sp,
        textAlign = TextAlign.Center,
        lineHeight = 40.sp,
        color = Color(0, 0, 0, 140)
    )
}