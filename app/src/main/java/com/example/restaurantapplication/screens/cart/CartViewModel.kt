package com.example.restaurantapplication.screens.cart

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Cart
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    val listOfProductInCart = MutableLiveData<List<Cart>>()

    fun getAllProductsFromCart() {
        viewModelScope.launch {
            listOfProductInCart.value = productDbRepository.getAllFromCart()
        }
    }

}