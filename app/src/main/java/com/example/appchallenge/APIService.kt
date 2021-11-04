package com.example.appchallenge

import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Url

interface APIService {

    @GET("activity?type=education")
    suspend fun getActivityEducation (): Response<Activities>

    companion object{
        fun getRetrofit(): Retrofit{
            return Retrofit.Builder()
                .baseUrl("http://www.boredapi.com/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    }

}