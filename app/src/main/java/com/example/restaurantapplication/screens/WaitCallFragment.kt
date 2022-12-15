package com.example.restaurantapplication.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.restaurantapplication.databinding.FragmentWaitCallBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WaitCallFragment: Fragment() {

    private lateinit var binding: FragmentWaitCallBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentWaitCallBinding.inflate(inflater, container, false)

        binding.view.setOnClickListener {
            findNavController().navigate(
                WaitCallFragmentDirections.actionWaitCallFragmentToMainScreenFragment()
            )
        }

        return binding.root
    }
}