package com.example.spendwise

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.spendwise.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding:FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(layoutInflater, container, false)

        // Getting clicked on lunch subscriptions
        binding.include2.llLunch.setOnClickListener {
            startActivity(Intent(requireActivity(), LunchActivity::class.java))
        }

        return binding.root
    }

}