package com.example.restaurantapplication.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.restaurantapplication.db.data.Food

@Dao
interface FoodDao {

    @Insert
    suspend fun insertFoodToDatabase(food: Food)

    @Query("SELECT * FROM food WHERE rate=5")
    suspend fun getListOfPopular(): List<Food>

    @Query("SELECT * FROM food WHERE calories=:category")
    suspend fun getListOfChosenCategory(category: String): List<Food>
}