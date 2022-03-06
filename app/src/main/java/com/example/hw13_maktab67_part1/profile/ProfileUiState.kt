package com.example.hw13_maktab67_part1.profile

import android.content.Context
import android.graphics.Bitmap
import android.util.Log
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw13_maktab67_part1.api.NetworkManager
import com.example.hw13_maktab67_part1.util.convert
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.Request
import okio.Timeout
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.awaitResponse
import retrofit2.http.Multipart

class ProfileUiState : ViewModel() {

    val imageView = MutableLiveData<Bitmap>()
    val family = MutableLiveData<String>()
    val email = MutableLiveData<String>()
    val phoneNumber = MutableLiveData<String>()
    val username = MutableLiveData<String>()
    val name = MutableLiveData<String>()



    fun upload(lifecycleOwner: LifecycleOwner){
        val imageToString = imageView.value?.convert().toString()
        val part = MultipartBody.create(MediaType.parse("image/*"), imageToString)
        val body = MultipartBody.Part.createFormData("a.png", "a.png", part)
        val test = NetworkManager.service.uploadImage("a.png", body).toString()
            Log.d("MAJID", "upload: $test")




    }

}