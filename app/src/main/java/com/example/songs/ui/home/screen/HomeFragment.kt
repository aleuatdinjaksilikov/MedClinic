package com.example.songs.ui.home.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.songs.R
import com.example.songs.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment:Fragment(R.layout.fragment_home) {

    private val binding : FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners() {
        binding.apply {
            doctors.setOnClickListener {

            }
            specializations.setOnClickListener {

            }
        }
    }
}