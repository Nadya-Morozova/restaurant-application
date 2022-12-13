package com.example.restaurantapplication.screens.activities.registration

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.restaurantapplication.R
import com.example.restaurantapplication.databinding.ActivityRegistrationFormBinding
import com.example.restaurantapplication.screens.activities.signin.LoginActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RegistrationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistrationFormBinding
    private val viewModel by viewModels<RegistrationViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_registration_form)

        viewModel.getAllListOfUsers()

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.isUserAdded.observe(this) {
            if (it == true) {
                Toast.makeText(this, "Account created successfully", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
                finish()
            }
        }

        binding.tvLoginOffer.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }

    }
}