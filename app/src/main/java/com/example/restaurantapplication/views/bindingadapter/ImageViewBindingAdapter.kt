package com.example.restaurantapplication.views.bindingadapter

import android.widget.ImageView
import androidx.databinding.BindingAdapter

@BindingAdapter("setImage")
fun ImageView.setImage(image: Int?) {
    this.setImageResource(image ?: 0)
}