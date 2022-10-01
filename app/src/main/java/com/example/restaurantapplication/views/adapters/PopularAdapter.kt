package com.example.restaurantapplication.views.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapplication.databinding.ItemPopularNowBinding
import com.example.restaurantapplication.db.data.Food
import com.example.restaurantapplication.views.holders.PopularHolder

class PopularAdapter(private var listOfPopularFood: List<Food>) :
    RecyclerView.Adapter<PopularHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PopularHolder =
        PopularHolder(
            ItemPopularNowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )

    override fun onBindViewHolder(holder: PopularHolder, position: Int) {
        holder.bind(listOfPopularFood[position])
    }

    override fun getItemCount(): Int = listOfPopularFood.size

    fun updateList(list: List<Food>) {
        listOfPopularFood = list
        notifyDataSetChanged()
    }
}