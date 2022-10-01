package com.example.restaurantapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.restaurantapplication.db.dao.FoodDao
import com.example.restaurantapplication.db.data.Food

@Database(entities = [Food::class], version = 1)
abstract class FoodDatabase: RoomDatabase() {
    abstract fun foodDao(): FoodDao
}