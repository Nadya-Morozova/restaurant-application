package com.example.restaurantapplication.views.bindingadapter

import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("setDollars")
fun TextView.setDollars(price: Double?) {
    this.text = "$${price}"
}