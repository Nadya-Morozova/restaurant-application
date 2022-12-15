package com.example.restaurantapplication.screens.search

import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnKeyListener
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.restaurantapplication.OnItemClick
import com.example.restaurantapplication.databinding.FragmentSearchBinding
import com.example.restaurantapplication.screens.globallist.ListFragmentDirections
import com.example.restaurantapplication.views.adapters.PopularAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private val viewModel by viewModels<SearchViewModel>()
    private lateinit var adapter: PopularAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSearchBinding.inflate(inflater, container, false)

        initObservers()

        binding.etSearch.setOnKeyListener(object : OnKeyListener {
            override fun onKey(v: View?, keyCode: Int, event: KeyEvent?): Boolean {
                if (event?.action == KeyEvent.ACTION_DOWN && keyCode == KeyEvent.KEYCODE_ENTER) {
                    viewModel.getFoodByQuery(binding.etSearch.text.toString())
                    binding.rvSearchItems.visibility = View.VISIBLE
                    return true
                }
                return false
            }
        })

        return binding.root
    }

    private fun initObservers() {
        adapter = PopularAdapter(listOf(), object : OnItemClick {
            override fun onItemClick(id: String) {
                findNavController().navigate(
                    SearchFragmentDirections.actionSearchFragmentToDetailsFragment(id)
                )
            }
        })
        binding.apply {
            viewModel.listOfFood.observe(viewLifecycleOwner) {
                adapter.updateList(it)

                rvSearchItems.adapter = adapter
                rvSearchItems.layoutManager = GridLayoutManager(requireContext(), 2)
            }
        }
    }
}