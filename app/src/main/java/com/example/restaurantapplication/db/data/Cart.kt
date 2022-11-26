package com.example.restaurantapplication.db.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "card")
data class Cart(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id") val idOfProduct: Int? = 0,
    val size: String? = null,
    val quantity: Int? = null,
    val price: Double? = null
)
