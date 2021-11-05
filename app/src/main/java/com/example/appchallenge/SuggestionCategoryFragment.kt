package com.example.appchallenge

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.appchallenge.databinding.FragmentSuggestionCategoryBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class SuggestionCategoryFragment : Fragment() {

    private lateinit var binding: FragmentSuggestionCategoryBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSuggestionCategoryBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnToolbarBackFragmentSuggestions.setOnClickListener {
            findNavController().navigate(R.id.action_suggestionCategoryFragment_to_activitiesFragment)
        }
        /*    super.onViewCreated(view, savedInstanceState)

        val name = "Corrutina Retrofit"

        CoroutineScope(Dispatchers.IO).launch{

            Log.i(name, "Lanzando llamada")

            val llamada = APIService.getRetrofit()
                .create(APIService::class.java)
                .getActivityEducation()

            Log.i(name, "Se ejecuta llamada")


            val respuesta: Activities? = llamada.body()

            activity?.runOnUiThread {
                Log.i(name, "Run Thread")

                if(llamada.isSuccessful){

                }
            }


        }*/


    }

}