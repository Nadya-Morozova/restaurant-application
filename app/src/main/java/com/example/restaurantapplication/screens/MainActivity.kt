package com.example.restaurantapplication.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.restaurantapplication.R
import com.example.restaurantapplication.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        binding.apply {
            val navHostFragment =
                supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment?
            navController = navHostFragment?.navController ?: throw NullPointerException()
            NavigationUI.setupWithNavController(bottomNavView, navController)

            bottomNavView.setOnItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        navController.navigate(R.id.mainScreenFragment)
                        true
                    }
                    R.id.likes -> {
                        navController.navigate(R.id.likesFragment)
                        true
                    }
                    R.id.cart -> {
                        navController.navigate(R.id.cartFragment)
                        true
                    }
                    else -> false
                }
            }
        }
    }
}