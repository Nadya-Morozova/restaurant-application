package com.example.restaurantapplication.screens.personal

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.restaurantapplication.databinding.FragmentPersonalDataBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PersonalDataFragment: Fragment() {

    private lateinit var binding: FragmentPersonalDataBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPersonalDataBinding.inflate(inflater, container, false)

        binding.btnGo.setOnClickListener {
            findNavController().navigate(
                PersonalDataFragmentDirections.actionPersonalDataFragmentToWaitCallFragment()
            )
        }

        return binding.root
    }
}