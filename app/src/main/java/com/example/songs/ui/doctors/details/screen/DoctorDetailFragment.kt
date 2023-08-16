package com.example.songs.ui.doctors.details.screen

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.songs.R
import com.example.songs.databinding.FragmentDoctorDetailsBinding

class DoctorDetailFragment: Fragment(R.layout.fragment_doctor_details) {

    private val binding : FragmentDoctorDetailsBinding by viewBinding(FragmentDoctorDetailsBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}