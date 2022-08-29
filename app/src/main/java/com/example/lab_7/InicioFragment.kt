package com.example.lab_7


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout



class InicioFragment : Fragment(R.layout.fragment_inicio) {
    private lateinit var buttonInicio: Button
    private lateinit var inputLayoutEmail: TextInputLayout
    private lateinit var textclick : TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonInicio = view.findViewById(R.id.button)
        inputLayoutEmail = view.findViewById(R.id.editTextTextEmailAddress)
        textclick = view.findViewById(R.id.textView2)

        setListeners()
    }

    private fun setListeners() {
        buttonInicio.setOnClickListener{
            val action = InicioFragmentDirections.actionInicioFragmentToHomeFragment(
                email = inputLayoutEmail.editText!!.toString()
            )
            requireView().findNavController().navigate(action)
        }

        textclick.setOnClickListener{
            requireView().findNavController().navigate(R.id.action_inicioFragment_to_CreateAccountFragment)
        }
    }

}