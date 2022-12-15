package com.example.restaurantapplication.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapplication.databinding.ItemCartBinding
import com.example.restaurantapplication.db.data.Cart
import com.example.restaurantapplication.views.holders.CartHolder

class CartAdapter(private var listOfProductsInCart: List<Cart>) :
    RecyclerView.Adapter<CartHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartHolder {
        return CartHolder(
            ItemCartBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: CartHolder, position: Int) {
        holder.bind(listOfProductsInCart[position])
    }

    override fun getItemCount(): Int = listOfProductsInCart.size

    fun updateList(list: List<Cart>) {
        listOfProductsInCart = list
        notifyDataSetChanged()
    }

}