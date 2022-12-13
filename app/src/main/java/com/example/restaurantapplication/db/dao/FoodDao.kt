package com.example.restaurantapplication.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.restaurantapplication.db.data.Cart
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.db.data.Like
import com.example.restaurantapplication.db.data.User

@Dao
interface FoodDao {

    // Food
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFoodToDatabase(food: Food)

    @Query("SELECT * FROM food WHERE rate=5")
    suspend fun getListOfPopular(): List<Food>

    @Query("SELECT * FROM food WHERE category=:category")
    suspend fun getListOfChosenCategory(category: String): List<Food>

    @Query("SELECT * FROM food WHERE id=:id")
    suspend fun getFoodById(id: String): Food

    @Query("SELECT * FROM food WHERE name LIKE '%' || :query || '%'")
    suspend fun getFoodByQuery(query: String): List<Food>

    //Likes
    @Query("SELECT * FROM likes")
    suspend fun getAllLikes(): List<Like>

    @Query("SELECT * FROM likes WHERE id=(:id)")
    suspend fun getLike(id: String): Like?

    @Insert
    suspend fun insertFood(like: Like)

    @Query("DELETE FROM likes WHERE id=(:id)")
    suspend fun deleteFood(id: String)

    //Cart
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addOrderToCart(cart: Cart)

    @Query("SELECT * FROM cart")
    suspend fun getAllFromCart(): List<Cart>

    //User
    @Insert
    suspend fun registerUser(user: User)

    @Query("SELECT * FROM user")
    suspend fun getAllUsers(): List<User>

    @Query("SELECT id, email FROM user")
    suspend fun getUsersEmail(): List<User>

    @Query("DELETE FROM user where email=(:email)")
    suspend fun removeAccountByEmail(email: String)
}