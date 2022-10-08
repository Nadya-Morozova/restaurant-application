package com.example.restaurantapplication.screens.mainscreen

import android.content.Context
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapplication.R
import com.example.restaurantapplication.data.Product
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.repository.ProductDbRepository
import com.example.restaurantapplication.repositories.ProductsRepository
import com.example.restaurantapplication.screens.mainscreen.data.UserGoogle
import com.google.android.gms.auth.api.signin.GoogleSignIn
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainScreenViewModel @Inject constructor(
    private val productsRepository: ProductsRepository,
    private val productDbRepository: ProductDbRepository
) : ViewModel() {

    val listOfCategory = listOf(
        Product(category = "pizza", image = R.drawable.category_icon_pizza),
        Product(category = "burgers", image = R.drawable.category_icon_burger),
        Product(category = "sushi", image = R.drawable.category_icon_sushi),
        Product(category = "soup", image = R.drawable.category_icon_soup),
        Product(category = "snack", image = R.drawable.category_icon_snack),
        Product(category = "dessert", image = R.drawable.category_icon_dessert),
        Product(category = "drink", image = R.drawable.category_icon_drink),
    )
    val listOfPopularFood = MutableLiveData<List<Food>>()

    fun getListOfPopular() {
        viewModelScope.launch {
            val list = productDbRepository.getListOfPopular()
            list.shuffled()
            listOfPopularFood.value = list.slice(0..1)
        }
    }

}