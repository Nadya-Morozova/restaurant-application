package com.example.restaurantapplication.screens.cart

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.restaurantapplication.databinding.FragmentCartBinding
import com.example.restaurantapplication.views.adapters.CartAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CartFragment : Fragment() {

    private lateinit var binding: FragmentCartBinding
    private val viewModel by viewModels<CartViewModel>()
    private val cartAdapter = CartAdapter(listOf())

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentCartBinding.inflate(inflater, container, false)

        viewModel.getAllProductsFromCart()

        initObservers()

        return binding.root
    }

    private fun initObservers() {
        var sum = 0.0
        binding.apply {
            viewModel.listOfProductInCart.observe(viewLifecycleOwner) {
                if (it.isEmpty()) {
                    tvText.visibility = View.VISIBLE
                    rvCartProduct.visibility = View.INVISIBLE
                    divider2.visibility = View.INVISIBLE
                    tvTotal.visibility = View.INVISIBLE
                    tvTitleTotal.visibility = View.INVISIBLE
                    btnProcessToPayment.visibility = View.INVISIBLE
                } else {
                    tvText.visibility = View.INVISIBLE
                    rvCartProduct.visibility = View.VISIBLE
                    divider2.visibility = View.VISIBLE
                    tvTotal.visibility = View.VISIBLE
                    tvTitleTotal.visibility = View.VISIBLE
                    btnProcessToPayment.visibility = View.VISIBLE
                    binding.btnProcessToPayment.setOnClickListener {
                        findNavController().navigate(
                            CartFragmentDirections.actionCartFragmentToPersonalDataFragment()
                        )
                    }

                    cartAdapter.updateList(it)
                    rvCartProduct.adapter = cartAdapter
                    rvCartProduct.layoutManager = LinearLayoutManager(requireContext())

                    it.forEach { cart ->
                        sum += cart.price ?: 0.0
                    }
                    tvTotal.text = "$${"%.2f".format(sum)}"
                }

            }

        }
    }

}