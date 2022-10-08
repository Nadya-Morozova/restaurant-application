package com.example.restaurantapplication.screens.globallist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.example.restaurantapplication.OnItemClick
import com.example.restaurantapplication.databinding.FragmentListBinding
import com.example.restaurantapplication.views.adapters.PopularAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListFragment : Fragment() {

    private val args by navArgs<ListFragmentArgs>()
    private val viewModel by viewModels<ListViewModel>()
    private lateinit var binding: FragmentListBinding
    private lateinit var popularAdapter: PopularAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentListBinding.inflate(inflater, container, false)

        if (args.type == "popular") {
            binding.tvTitle.text = "popular"
            viewModel.getListOfPopular()
        } else {
            binding.tvTitle.text = args.type
            viewModel.getListOfChosenCategory(args.type)
        }

        initObservers()

        return binding.root
    }

    private fun initObservers() {
        popularAdapter = PopularAdapter(listOf(), object : OnItemClick {
            override fun onItemClick(id: String) {
                findNavController().navigate(
                    ListFragmentDirections.actionListFragmentToDetailsFragment(id)
                )
            }
        })
        binding.apply {
            viewModel.listOfFood.observe(viewLifecycleOwner) {
                popularAdapter.updateList(it)
                rvListOfProduct.layoutManager = GridLayoutManager(requireContext(), 2)
                rvListOfProduct.adapter = popularAdapter
            }
        }
    }


}