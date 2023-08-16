package com.example.songs.ui.doctors.list.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.songs.R
import com.example.songs.databinding.FragmentDoctorsBinding

class DoctorsFragment: Fragment(R.layout.fragment_doctors) {

    private val binding : FragmentDoctorsBinding by viewBinding(FragmentDoctorsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}