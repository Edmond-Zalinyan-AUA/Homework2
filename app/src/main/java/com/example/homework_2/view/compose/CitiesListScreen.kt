package com.example.homework_2.view.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.homework_2.common.City
import com.example.homework_2.viewModel.DataLoaderViewModel

@Composable
fun CitiesListScreen(
    cities: List<City>? = null,
    navController: NavController,
    viewModel: DataLoaderViewModel
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
            for (city in cities) {
                viewModel.loadTemperatures(city)
                SingleCity(city = city)
            }
        }
    }
}

@Composable
fun SingleCity(city: City, modifier: Modifier = Modifier) {
    Row {
        Column(
            modifier = Modifier.padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = city.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(100.dp)
            )
            if (city.temperature != null)
                Text(
                    text = "${city.temperature} °C",
                    fontSize = 20.sp,
                    textAlign = TextAlign.Center
                )
        }
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