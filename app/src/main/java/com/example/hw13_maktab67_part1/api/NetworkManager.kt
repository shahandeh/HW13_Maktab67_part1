package com.example.hw13_maktab67_part1.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkManager {

    private val client: OkHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply{
            level = HttpLoggingInterceptor.Level.BODY
        })
        .build()

    private val retrofit: Retrofit = Retrofit
        .Builder()
        .baseUrl("http://51.195.19.222/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    val service: UploadApi = retrofit.create(UploadApi::class.java)
}