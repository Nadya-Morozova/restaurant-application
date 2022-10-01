package com.example.restaurantapplication.views.holders

import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapplication.databinding.ItemPopularNowBinding
import com.example.restaurantapplication.db.data.Food

class PopularHolder(private val binding: ItemPopularNowBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(food: Food) {
        binding.apply {
            imgPopular.setImageResource(food.image ?: 0)
            tvNamePopular.text = food.name
            tvPrice.text = "$${food.price}"
        }
    }

}