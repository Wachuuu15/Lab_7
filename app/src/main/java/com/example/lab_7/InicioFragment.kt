package com.example.lab_7

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout


class InicioFragment : Fragment(R.layout.fragment_inicio) {

    private lateinit var buttonInicio: Button
    private lateinit var inputLayoutEmail: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        buttonInicio = view.findViewById(R.id.button)
        inputLayoutEmail = view.findViewById(R.id.editTextTextEmailAddress)

        setListeners()
    }

    private fun setListeners() {
        buttonInicio.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_homeFragment_to_userProfile)
        }
    }

}