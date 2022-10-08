package com.example.restaurantapplication.screens.details

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.data.Like
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    val foodItem = MutableLiveData<Food>()
    val isLikedItem = MutableLiveData<Boolean>()

    fun getFoodById(id: String) {
        viewModelScope.launch {
            foodItem.value = productDbRepository.getFoodById(id)
        }
    }

    fun isLiked(id: String) {
        viewModelScope.launch {
            isLikedItem.value = productDbRepository.isLiked(id)
        }
    }

    fun insertFood(like: Like) {
        viewModelScope.launch {
            productDbRepository.insertFood(like)
        }
    }

    fun deleteFood(id: String) {
        viewModelScope.launch {
            productDbRepository.deleteFood(id)
        }
    }

}