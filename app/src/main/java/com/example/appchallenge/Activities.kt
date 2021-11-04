package com.example.appchallenge

import com.google.gson.annotations.SerializedName

data class Activities(

    @SerializedName("activity") var actividad: String,
    @SerializedName("type") var tipo: String,
    @SerializedName("participants") var participants: Int,
    @SerializedName("price") var price: Double

)
