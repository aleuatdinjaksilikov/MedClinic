package com.example.songs.ui.doctors.edit

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.songs.R
import com.example.songs.databinding.FragmentEditDoctorBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class EditDoctorFragment:Fragment(R.layout.fragment_edit_doctor) {

    private val binding : FragmentEditDoctorBinding by viewBinding(FragmentEditDoctorBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}