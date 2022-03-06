package com.example.hw13_maktab67_part1.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager {

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(UploadApi::class.java)
}