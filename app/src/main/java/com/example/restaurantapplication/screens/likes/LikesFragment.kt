package com.example.restaurantapplication.screens.likes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import com.example.restaurantapplication.OnItemClick
import com.example.restaurantapplication.databinding.FragmentLikesBinding
import com.example.restaurantapplication.views.adapters.PopularAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LikesFragment : Fragment() {

    private lateinit var binding: FragmentLikesBinding
    private val viewModel by viewModels<LikesViewModel>()
    private lateinit var adapter: PopularAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLikesBinding.inflate(inflater, container, false)

        viewModel.getLikes()

        initObservers()

        return binding.root
    }

    private fun initObservers() {
        binding.apply {
            adapter = PopularAdapter(listOf(), object : OnItemClick {
                override fun onItemClick(id: String) {
                    LikesFragmentDirections.actionLikesFragmentToDetailsFragment(id)
                }
            })
            viewModel.listOfLikesFood.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    rvListOfProduct.visibility = View.GONE
                    tvText.visibility = View.VISIBLE
                } else {
                    adapter.updateList(it)
                    tvText.visibility = View.GONE
                    rvListOfProduct.visibility = View.VISIBLE
                    rvListOfProduct.adapter = adapter
                    rvListOfProduct.layoutManager = GridLayoutManager(requireContext(), 2)
                }
            }
        }
    }

}