package com.example.appchallenge

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appchallenge.databinding.FragmentHomeBinding
import com.example.appchallenge.databinding.FragmentTermsBinding


class TermsFragment : Fragment() {

    private lateinit var binding: FragmentTermsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTermsBinding.inflate(inflater, container, false)
        return binding.root
    }

}