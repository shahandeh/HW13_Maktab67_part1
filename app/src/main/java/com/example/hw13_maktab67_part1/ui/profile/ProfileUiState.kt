package com.example.hw13_maktab67_part1.ui.profile

import android.graphics.Bitmap
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.hw13_maktab67_part1.api.NetworkManager
import com.example.hw13_maktab67_part1.repository.Profile
import com.example.hw13_maktab67_part1.util.arrayConvert
import okhttp3.MediaType
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ProfileUiState : ViewModel() {

    val imageView: Bitmap? = null
    val family = MutableLiveData<String>()
    val email = MutableLiveData<String>()
    val phoneNumber = MutableLiveData<String>()
    val username = MutableLiveData<String>()
    val name = MutableLiveData<String>()
    var imageUrl : String? = null
    private val _isRegistered: MutableLiveData<Boolean> = MutableLiveData()
    val isRegistered: LiveData<Boolean> get() = _isRegistered

    init {
        if (Profile.isRegistered) {
            name.value = Profile.name.toString()
            family.value = Profile.family.toString()
            email.value = Profile.email.toString()
            phoneNumber.value = Profile.phoneNumber.toString()
            username.value = Profile.username.toString()
            imageUrl = Profile.imageUrl.toString()
            _isRegistered.value = Profile.isRegistered
        }
    }

    private fun inputIsValid(): Boolean {
        var out = false
        if (name.value.toString().isNotBlank() &&
            family.value.toString().isNotBlank() &&
            email.value.toString().isNotBlank() &&
            phoneNumber.value.toString().isNotBlank() &&
            username.value.toString().isNotBlank()
        ) {
            Profile.name = name.value
            Profile.family = family.value
            Profile.email = email.value
            Profile.phoneNumber = phoneNumber.value
            Profile.username = username.value
            Profile.isRegistered = true
            out = true
        }
        return out
    }

    private fun upload(bitmap: Bitmap) {
        val username = username.value
        val requestBody =
            MultipartBody.create(MediaType.parse("image/*"), bitmap.arrayConvert())
        val body = MultipartBody.Part.createFormData(
            "image",
            "${username}.png",
            requestBody
        )
        NetworkManager.service.uploadImage(username.toString(), body)
            .enqueue(object : Callback<Any?> {
                override fun onResponse(call: Call<Any?>, response: Response<Any?>) {
                    _isRegistered.postValue(true)
                    imageUrl = "http://51.195.19.222/uploads/${username}.png"
                }

                override fun onFailure(call: Call<Any?>, t: Throwable) {}
            })
    }

    fun register(bitmap: Bitmap) {
        Log.d("MAJID", "2")
        if (inputIsValid()) upload(bitmap)
    }

}