package com.example.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appchallenge.databinding.FragmentSuggestionCategoryBinding


class SuggestionCategoryFragment : Fragment() {

    private lateinit var binding: FragmentSuggestionCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSuggestionCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }


}