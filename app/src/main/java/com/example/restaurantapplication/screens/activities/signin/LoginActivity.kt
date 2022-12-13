package com.example.restaurantapplication.screens.activities.signin

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.restaurantapplication.R
import com.example.restaurantapplication.databinding.ActivityLoginFormBinding
import com.example.restaurantapplication.screens.MainActivity
import com.example.restaurantapplication.screens.activities.SplashScreenActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginFormBinding
    private val viewModel by viewModels<LoginViewModel>()

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login_form)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        viewModel.isUserLogIn.observe(this) {
            if (it == true) {
                Toast.makeText(this, "Let's go", Toast.LENGTH_SHORT).show()
                sharedPreferences.edit()
                    .putBoolean(SplashScreenActivity.CHANGED_ACTIVITY, true)
                    .commit()
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Something wrong", Toast.LENGTH_SHORT).show()
            }
        }
    }

}