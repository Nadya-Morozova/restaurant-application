package com.example.restaurantapplication.db.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User(
    val email: String? = null,
    val password: String? = null
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}
