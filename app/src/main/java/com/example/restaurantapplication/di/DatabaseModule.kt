package com.example.restaurantapplication.di

import android.content.Context
import androidx.room.Room
import com.example.restaurantapplication.db.FoodDatabase
import com.example.restaurantapplication.db.dao.FoodDao
import com.example.restaurantapplication.db.repository.ProductDbRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    fun provideDatabase(@ApplicationContext context: Context): FoodDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            FoodDatabase::class.java,
            ProductDbRepository.DATABASE_NAME
        ).build()
    }

    @Provides
    fun provideFoodDao(foodDatabase: FoodDatabase): FoodDao {
        return foodDatabase.foodDao()
    }

}