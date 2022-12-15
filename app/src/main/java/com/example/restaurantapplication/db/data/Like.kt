package com.example.restaurantapplication.db.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "likes")
data class Like(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "id")
    val idFood: String
)