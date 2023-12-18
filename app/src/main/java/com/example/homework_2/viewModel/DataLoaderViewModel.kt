package com.example.homework_2.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homework_2.common.City
import com.example.homework_2.repository.DataLoaderRepository
import com.example.homework_2.repository.WeatherResponse
import kotlinx.coroutines.launch

class DataLoaderViewModel : ViewModel() {
    private val repository = DataLoaderRepository()

    private val _liveWeatherData = MutableLiveData<MutableMap<City, WeatherResponse>>()
    val liveWeatherData: LiveData<MutableMap<City, WeatherResponse>> = _liveWeatherData

    init {
        _liveWeatherData.value = mutableMapOf()
    }

    fun loadTemperatures(city: City) {
        viewModelScope.launch {
            _liveWeatherData.value!![city] = repository.loadWeather(city)
        }
    }
}