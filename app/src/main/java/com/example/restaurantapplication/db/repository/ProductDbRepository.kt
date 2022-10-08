package com.example.restaurantapplication.db.repository

import com.example.restaurantapplication.db.dao.FoodDao
import com.example.restaurantapplication.db.data.Food
import dagger.hilt.android.scopes.ViewModelScoped
import javax.inject.Inject

@ViewModelScoped
class ProductDbRepository @Inject constructor(var foodDao: FoodDao) {

    companion object {
        const val DATABASE_NAME = "FoodDB"
    }

    suspend fun insertItemsOfFood(food: Food) = foodDao.insertFoodToDatabase(food)

    suspend fun getListOfPopular(): List<Food> = foodDao.getListOfPopular()

    suspend fun getListOfChosenCategory(category: String): List<Food> =
        foodDao.getListOfChosenCategory(category)

    suspend fun getFoodById(id: String): Food = foodDao.getFoodById(id)

    suspend fun getFoodByQuery(query: String): List<Food> = foodDao.getFoodByQuery(query)
}