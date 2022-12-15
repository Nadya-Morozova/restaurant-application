package com.example.restaurantapplication.screens.activities

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.animation.ValueAnimator
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.setPadding
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.lifecycleScope
import com.example.restaurantapplication.R
import com.example.restaurantapplication.databinding.ActivitySplashScreenBinding
import com.example.restaurantapplication.screens.MainActivity
import com.example.restaurantapplication.screens.activities.welcome.WelcomeScreenActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class SplashScreenActivity: AppCompatActivity() {

    companion object {
        const val CHANGED_ACTIVITY = "changed activity"
    }

    private lateinit var binding: ActivitySplashScreenBinding

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onStart() {
        super.onStart()
        animate(binding.imageLogo)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        supportActionBar?.hide()

        val value = sharedPreferences.getBoolean(CHANGED_ACTIVITY, false)

        lifecycleScope.launch {
            delay(2000L)
            if (value) {
                startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
                finish()
            } else {
                startActivity(Intent(this@SplashScreenActivity, WelcomeScreenActivity::class.java))
                finish()
            }

        }

    }

    private fun animate(view: ImageView) {
        val alphaAnimator = ObjectAnimator
            .ofFloat(view, View.ALPHA, 0f, 1f)
            .setDuration(2000)

        val paddingAnimator = ValueAnimator.ofInt(200, 20)
            .setDuration(2000)
        paddingAnimator.addUpdateListener {
            view.setPadding(it.animatedValue as Int)
        }

        val animatorSet = AnimatorSet()
        animatorSet.playTogether(alphaAnimator, paddingAnimator)
        animatorSet.start()
    }
}