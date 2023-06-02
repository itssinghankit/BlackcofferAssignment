package com.example.blackcoffer.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.blackcoffer.databinding.FragmentPersonalBinding

class PersonalFragment : Fragment() {
    private lateinit var binding: FragmentPersonalBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPersonalBinding.inflate(layoutInflater)

        return binding.root
    }

}
