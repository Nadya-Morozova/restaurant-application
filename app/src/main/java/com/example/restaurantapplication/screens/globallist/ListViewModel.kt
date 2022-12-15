package com.example.restaurantapplication.screens.globallist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ListViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    val listOfFood = MutableLiveData<List<Food>>()

    fun getListOfPopular() {
        viewModelScope.launch {
            listOfFood.value = productDbRepository.getListOfPopular()
        }
    }

    fun getListOfChosenCategory(category: String) {
        viewModelScope.launch {
            listOfFood.value = productDbRepository.getListOfChosenCategory(category)
        }
    }

}