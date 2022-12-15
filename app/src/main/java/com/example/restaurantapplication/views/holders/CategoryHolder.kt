package com.example.restaurantapplication.views.holders

import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapplication.data.Product
import com.example.restaurantapplication.databinding.ItemCategoryBinding

class CategoryHolder(private val binding: ItemCategoryBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(product: Product) {
        binding.apply {
            imgCategory.setImageResource(product.image ?: 0)
            tvCategory.text = product.category
        }
    }

    fun getButton() = binding.btnGo

    fun getCategory(): String = binding.tvCategory.text.toString()

}