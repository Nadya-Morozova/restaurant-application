package com.example.restaurantapplication.screens.mainscreen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantapplication.ActionHandler
import com.example.restaurantapplication.databinding.FragmentMainScreenBinding
import com.example.restaurantapplication.views.adapters.CategoryAdapter
import com.example.restaurantapplication.views.adapters.PopularAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainScreenFragment : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding
    private val viewModel by viewModels<MainScreenViewModel>()
    private lateinit var categoryAdapter: CategoryAdapter
    private val popularAdapter = PopularAdapter(listOf(), null)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)

        viewModel.getListOfPopular()
        initViews()
        initObservers()

        return binding.root
    }

    private fun initViews() {
        categoryAdapter = CategoryAdapter(listOf(), object : ActionHandler {
            override fun onCategoryClick(category: String) {
                findNavController().navigate(
                    MainScreenFragmentDirections.actionMainScreenFragmentToListFragment(category)
                )
            }
        })

        binding.apply {
            categoryAdapter.updateList(viewModel.listOfCategory)
            rvCategories.layoutManager =
                LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
            rvCategories.adapter = categoryAdapter

            tvViewAll.setOnClickListener {
                findNavController().navigate(
                    MainScreenFragmentDirections.actionMainScreenFragmentToListFragment("popular")
                )
            }
        }
    }

    private fun initObservers() {
        binding.apply {
            viewModel.listOfPopularFood.observe(viewLifecycleOwner) {
                popularAdapter.updateList(it)
                rvPopularNow.layoutManager = GridLayoutManager(requireContext(), 2)
                rvPopularNow.adapter = popularAdapter
            }
        }
    }
}