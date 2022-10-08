package com.example.restaurantapplication.screens.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
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
    ): View? {
        binding = FragmentProductBinding.inflate(layoutInflater)

        viewModel.getFoodById(args.id)
        viewModel.isLiked(args.id)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this

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

}