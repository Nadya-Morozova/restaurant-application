package com.example.restaurantapplication.screens.details

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.restaurantapplication.R
import com.example.restaurantapplication.databinding.FragmentProductBinding
import com.example.restaurantapplication.db.data.Like
import com.like.LikeButton
import com.like.OnLikeListener
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetailsFragment : Fragment() {

    private lateinit var binding: FragmentProductBinding
    private val viewModel by viewModels<DetailsViewModel>()
    private val args by navArgs<DetailsFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProductBinding.inflate(inflater, container, false)

        viewModel.getFoodById(args.id)
        viewModel.isLiked(args.id)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

        checkSizeOfProduct()

        binding.btnLike.setOnLikeListener(object : OnLikeListener {
            override fun liked(likeButton: LikeButton?) {
                viewModel.insertFood(Like(args.id))
            }

            override fun unLiked(likeButton: LikeButton?) {
                viewModel.deleteFood(args.id)
            }
        })

        return binding.root
    }

    private fun checkSizeOfProduct() {
        var state = true
        binding.apply {
            acbSizeS.setOnClickListener {
                if (state) {
                    state = false
                    acbSizeS.setTextColor(Color.parseColor("#123C69"))
                    acbSizeS.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons_white)

                    acbSizeM.setTextColor(Color.WHITE)
                    acbSizeM.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)

                    acbSizeL.setTextColor(Color.WHITE)
                    acbSizeL.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)

                    viewModel?.setSizeOfProduct("S")
                } else {
                    state = true
                    acbSizeS.setTextColor(Color.WHITE)
                    acbSizeS.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)
                    viewModel?.setSizeOfProduct("")
                }
            }

            binding.acbSizeM.setOnClickListener {
                if (state) {
                    state = false
                    acbSizeM.setTextColor(Color.parseColor("#123C69"))
                    acbSizeM.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons_white)

                    acbSizeS.setTextColor(Color.WHITE)
                    acbSizeS.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)

                    acbSizeL.setTextColor(Color.WHITE)
                    acbSizeL.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)

                    viewModel?.setSizeOfProduct("M")
                } else {
                    state = true
                    acbSizeM.setTextColor(Color.WHITE)
                    acbSizeM.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)
                    viewModel?.setSizeOfProduct("")
                }
            }

            binding.acbSizeL.setOnClickListener {
                if (state) {
                    state = false
                    acbSizeL.setTextColor(Color.parseColor("#123C69"))
                    acbSizeL.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons_white)

                    acbSizeM.setTextColor(Color.WHITE)
                    acbSizeM.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)

                    acbSizeS.setTextColor(Color.WHITE)
                    acbSizeS.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)

                    viewModel?.setSizeOfProduct("L")
                } else {
                    state = true
                    acbSizeL.setTextColor(Color.WHITE)
                    acbSizeL.background =
                        ContextCompat.getDrawable(requireContext(), R.drawable.round_buttons)
                    viewModel?.setSizeOfProduct("")
                }
            }
        }
    }

}