package com.example.appchallenge

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.whenCreated
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

        setUpCategory()


    }

    private fun setUpCategory() {
        val name = "Corrutina Retrofit"
        val type = "education" //datos para prueba
        val numberPart = 5      // datos para prueba

        CoroutineScope(Dispatchers.IO).launch {

            Log.i(name, "Lanzando llamada")


            val llamada = APIService.getRetrofit()
                .create(APIService::class.java)
                .getActivity("activity?type=$type&$numberPart")

            Log.i(name, "Se ejecuta llamada")

            val respuesta: Activities? = llamada.body()

            activity?.runOnUiThread {
                Log.i(name, "Run Thread")

                if (llamada.isSuccessful) {

                   val price = respuesta?.price?.toDouble()
                    binding.tvTextcostFragmentsSuggestions.text = when (price!!){
                        0.0 ->  "Free"
                        in 0.0..0.3 ->  "Low"
                        in 0.3..0.6 -> "Medium"
                        else -> "High"
                    }

                    binding.tvTitleActivityFragmentSuggestions.text = respuesta?.actividad
                    binding.tvNumParticipansFragmentSuggestions.text = respuesta?.participants.toString()

                    Log.i(name, "Actualizando textView")
                }
            }
        }
    }

}