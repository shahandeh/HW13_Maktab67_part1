package com.example.hw13_maktab67_part1.api

import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Path

interface UploadApi {

    @Multipart
    @POST("users/{username}")
    fun uploadImage(
        @Path("username") username : String,
        @Part image : MultipartBody.Part
    ) : Call<Any>

}