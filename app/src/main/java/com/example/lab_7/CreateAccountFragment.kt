package com.example.lab_7

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputLayout

class CreateAccountFragment : Fragment(R.layout.fragment_create_count) {

    private lateinit var buttoncreate: Button
    private lateinit var inputEmail: TextInputLayout

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttoncreate= view.findViewById(R.id.buttoncreatecuenta)
        inputEmail= view.findViewById(R.id.name_email)

        setListeners()
    }

    private fun setListeners() {
        buttoncreate.setOnClickListener{
            requireView().findNavController().navigate(
               CreateAccountFragmentDirections.actionCreateAccountFragmentToHomeFragment(
                   email = inputEmail.editText!!.toString()
               )
            )
        }
    }

}

