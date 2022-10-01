package com.example.restaurantapplication.db.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food")
data class Food(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id") val id: Int? = 0,
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
