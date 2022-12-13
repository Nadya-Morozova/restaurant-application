package com.example.restaurantapplication.screens.details

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.db.data.Cart
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.data.Like
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.launch
import java.text.DecimalFormat
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val productDbRepository: ProductDbRepository,
    @ApplicationContext private val context: Context
) : ViewModel() {

    val foodItem = MutableLiveData<Food>()
    val isLikedItem = MutableLiveData<Boolean>()

    var counterOfProduct = 1
    var count = MutableLiveData(1)

    var price = 0.0
    var newPrice = MutableLiveData<Double>()

    private val size = MutableLiveData<String>()

    fun getFoodById(id: String) {
        viewModelScope.launch {
            foodItem.value = productDbRepository.getFoodById(id)
            price = foodItem.value?.price ?: 0.0
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

    fun setSizeOfProduct(size: String) {
        this.size.value = size
    }

    fun onClickButtonRemoveOneCount() {
        if (counterOfProduct >= 1) {
            counterOfProduct -= 1
            price -= foodItem.value?.price ?: 0.0
        }
        if (counterOfProduct == 0) {
            price = 0.0
            counterOfProduct = 0
        }
        newPrice.value = DecimalFormat("##.#").format(price).replace(",", ".").toDouble()
        count.value = counterOfProduct
    }

    fun onClickButtonAddOneCount() {
        counterOfProduct += 1
        price += foodItem.value?.price ?: 0.0
        newPrice.value = DecimalFormat("##.#").format(price).replace(",", ".").toDouble()
        count.value = counterOfProduct
    }

    fun addOrderToCart() {
        val cart: Cart
        var percent = 0
        when (size.value) {
            "S" -> percent = 2
            "M" -> percent = 5
            "L" -> percent = 10
        }
        cart = if (newPrice.value != null) {
            Toast.makeText(context, "Item added to cart!", Toast.LENGTH_SHORT).show()
            Cart(
                idOfProduct = foodItem.value?.id,
                image = foodItem.value?.image,
                name = foodItem.value?.name,
                size = size.value,
                quantity = count.value,
                price = newPrice.value?.plus(percent)
            )
        } else {
            Toast.makeText(context, "Item added to cart!", Toast.LENGTH_SHORT).show()
            Cart(
                idOfProduct = foodItem.value?.id,
                image = foodItem.value?.image,
                name = foodItem.value?.name,
                size = size.value,
                quantity = count.value,
                price = foodItem.value?.price?.plus(percent)
            )
        }
        viewModelScope.launch {
            if (size.value != null) {
                productDbRepository.addOrderToCart(cart)
            } else {
                Toast.makeText(context, "Choose size!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}