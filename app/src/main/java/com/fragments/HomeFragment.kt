package com.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.chatapp.R

class HomeFragment: Fragment(R.layout.fragment_home) {

    private lateinit var navController : NavController
    private lateinit var button: Button
    private lateinit var button2: Button


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button = view.findViewById(R.id.home_registerButton)
        button2 = view.findViewById(R.id.home_loginButton)

        navController = Navigation.findNavController(view)


       button.setOnClickListener {

        }




    }
}