package com.example.restaurantapplication.db.repository

import com.example.restaurantapplication.db.dao.FoodDao
import com.example.restaurantapplication.db.data.Cart
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.data.Like
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ProductDbRepository @Inject constructor(var foodDao: FoodDao) {

    companion object {
        const val DATABASE_NAME = "FoodDB"
    }

    // Food
    suspend fun insertItemsOfFood(food: Food) = foodDao.insertFoodToDatabase(food)

    suspend fun getListOfPopular(): List<Food> = foodDao.getListOfPopular()

    suspend fun getListOfChosenCategory(category: String): List<Food> =
        foodDao.getListOfChosenCategory(category)

    suspend fun getFoodById(id: String): Food = foodDao.getFoodById(id)

    suspend fun getFoodByQuery(query: String): List<Food> = foodDao.getFoodByQuery(query)

    // Likes
    suspend fun getAllLikes() = foodDao.getAllLikes()

    suspend fun isLiked(id: String): Boolean {
        return foodDao.getLike(id) != null
    }

    suspend fun insertFood(like: Like) = foodDao.insertFood(like)

    suspend fun deleteFood(id: String) = foodDao.deleteFood(id)

    // Cart
    suspend fun addOrderToCart(cart: Cart) = foodDao.addOrderToCart(cart)
}