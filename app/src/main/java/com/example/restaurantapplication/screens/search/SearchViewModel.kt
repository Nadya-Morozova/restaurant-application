package com.example.restaurantapplication.screens.search

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    val listOfFood = MutableLiveData<List<Food>>()

    fun getFoodByQuery(query: String) {
        viewModelScope.launch {
            listOfFood.value = productDbRepository.getFoodByQuery(query)
        }
    }
}