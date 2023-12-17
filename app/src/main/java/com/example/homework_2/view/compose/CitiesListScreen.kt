package com.example.homework_2.view.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.homework_2.R
import com.example.homework_2.common.City

@Composable
fun CitiesListScreen(
    cities: List<City>? = null,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Button(
            onClick = { navController.popBackStack() },
            modifier = Modifier.padding(5.dp)
        ) {
            Text(text = "Back")
        }
        if (cities != null) {
            for (city in cities)
                SingleCity(city = city)
        }
    }
}

@Composable
fun SingleCity(city: City, modifier: Modifier = Modifier) {
    Row {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = null,
            modifier = Modifier.padding(5.dp, 20.dp)
        )
        Column(modifier = Modifier.padding(10.dp)) {
            Text(
                text = city.name.orEmpty(),
                fontSize = 35.sp,
                modifier = modifier,
            )
            Text(
                text = city.description(),
                fontSize = 20.sp,
                modifier = modifier
            )
        }
    }
}