package com.example.restaurantapplication.views.holders

import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapplication.databinding.ItemCartBinding
import com.example.restaurantapplication.db.data.Cart

class CartHolder(val binding: ItemCartBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(cart: Cart) {
        binding.apply {
            imgProduct.setImageResource(cart.image ?: 0)
            tvNameProduct.text = cart.name
            tvQuantity.text = cart.quantity.toString()
            tvSizeProduct.text = cart.size
            tvTotalPrice.text = "$${cart.price}"
        }
    }
}