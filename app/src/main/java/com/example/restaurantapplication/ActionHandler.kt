package com.example.restaurantapplication

interface ActionHandler {
    fun onCategoryClick(category: String)
}

interface OnItemClick {
    fun onItemClick(id: String)
}