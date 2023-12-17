package com.example.homework_2.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homework_2.common.City
import com.example.homework_2.contentManager.DataLoader
import com.example.homework_2.repository.WeatherResponse
import kotlinx.coroutines.launch

class DataLoaderViewModel : ViewModel() {
    private val repository = DataLoader()

    private val _liveWeatherData = MutableLiveData<WeatherResponse>()
    val liveWeatherData: LiveData<WeatherResponse> = _liveWeatherData

    fun loadTemperatures(city: City) {
        viewModelScope.launch {
            _liveWeatherData.postValue(repository.loadWeather(city))
        }
    }
}