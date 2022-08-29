package com.example.lab_7

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController


class UserProfileFragment : Fragment(R.layout.fragment_user_profile) {


    private lateinit var buttonvolver: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonvolver = view.findViewById(R.id.button3)
        setListeners()
    }

    private fun setListeners() {
        buttonvolver.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_userProfileFragment_to_inicioFragment)
        }
    }

}