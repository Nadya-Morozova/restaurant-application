package com.example.restaurantapplication.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapplication.ActionHandler
import com.example.restaurantapplication.data.Product
import com.example.restaurantapplication.databinding.ItemCategoryBinding
import com.example.restaurantapplication.views.holders.CategoryHolder

class CategoryAdapter(private var listOfProducts: List<Product>, val actionHandler: ActionHandler) :
    RecyclerView.Adapter<CategoryHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryHolder {
        val view = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = CategoryHolder(view)

        holder.getButton().setOnClickListener {
            actionHandler.onCategoryClick(holder.getCategory())
        }

        return holder
    }


    override fun onBindViewHolder(holder: CategoryHolder, position: Int) {
        holder.bind(listOfProducts[position])
    }

    override fun getItemCount(): Int = listOfProducts.size

    fun updateList(list: List<Product>) {
        listOfProducts = list
        notifyDataSetChanged()
    }
}