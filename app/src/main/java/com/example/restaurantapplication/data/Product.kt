package com.example.restaurantapplication.data

data class Product(
    val id: Int? = 0,
    val name: String? = null,
    val price: Double? = null,
    val category: String? = null,
    val ingredients: String? = null,
    val image: Int? = null,
    val description: String? = null,
    val averageCookingTime: String? = null,
    val rate: Double? = null,
    val calories: String? = null
)
