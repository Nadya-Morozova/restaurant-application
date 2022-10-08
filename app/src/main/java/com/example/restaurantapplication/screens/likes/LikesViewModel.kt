package com.example.restaurantapplication.screens.likes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LikesViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    val listOfLikesFood = MutableLiveData<List<Food>>()
    private val foodList = mutableListOf<Food>()

    fun getLikes() {
        viewModelScope.launch {
            productDbRepository.getAllLikes().forEach {
                foodList.add(productDbRepository.getFoodById(it.idFood))
            }
            listOfLikesFood.value = foodList
        }
    }
}