package com.example.restaurantapplication.screens.activities.welcome

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import com.example.restaurantapplication.repositories.ProductsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class WelcomeScreenViewModel @Inject constructor(
    private val productsRepository: ProductsRepository,
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    fun addProductsToDb() {
        viewModelScope.launch {
            productsRepository.fillList().forEach {
                productDbRepository.insertItemsOfFood(
                    Food(
                        it.id,
                        it.name,
                        it.price,
                        it.category,
                        it.ingredients,
                        it.image,
                        it.description,
                        it.averageCookingTime,
                        it.rate,
                        it.calories,
                    )
                )
            }
        }
    }
}