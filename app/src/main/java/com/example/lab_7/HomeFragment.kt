package com.example.lab_7

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs


class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var buttonactualizar: Button
    private lateinit var textHome: TextView

    private val args: HomeFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonactualizar = view.findViewById(R.id.button2)
        textHome = view.findViewById(R.id.textView4)
        textHome.text= args.email
        setListeners()
    }

    private fun setListeners() {
        buttonactualizar.setOnClickListener{
            requireView().findNavController().navigate(
                HomeFragmentDirections.actionHomeFragmentToUserProfileFragment()
            )
        }
    }

}