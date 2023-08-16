package com.example.songs.ui.doctors.add

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.songs.R
import com.example.songs.databinding.FragmentAddDoctorBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AddDoctorFragment:Fragment(R.layout.fragment_add_doctor) {

    private val binding : FragmentAddDoctorBinding by viewBinding(FragmentAddDoctorBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}