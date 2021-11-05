package com.example.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appchallenge.databinding.FragmentActivitiesBinding
import com.example.appchallenge.databinding.FragmentHomeBinding

class ActivitiesFragment : Fragment() {

    private lateinit var binding: FragmentActivitiesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentActivitiesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.ibRandomactivities.setOnClickListener {
            findNavController().navigate(R.id.action_activitiesFragment_to_suggestionRandomFragment)
        }
    }

}