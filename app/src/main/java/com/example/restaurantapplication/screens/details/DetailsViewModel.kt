package com.example.restaurantapplication.screens.details

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    val foodItem = MutableLiveData<Food>()

    fun getFoodById(id: String) {
        viewModelScope.launch {
            foodItem.value = productDbRepository.getFoodById(id)
        }
    }

}