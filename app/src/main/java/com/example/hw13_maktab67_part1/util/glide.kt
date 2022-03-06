package com.example.hw13_maktab67_part1.util

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.util.Base64
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.hw13_maktab67_part1.R
import java.io.ByteArrayOutputStream

fun ImageView.glide(url: String) {
    Glide.with(context)
        .load(url)
        .placeholder(R.drawable.loading_animation)
        .into(this)
}

fun Bitmap.convert(): String {
    val byteArrayOutputStream = ByteArrayOutputStream()
    this.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)
    val byteArray = byteArrayOutputStream.toByteArray()
    return Base64.encodeToString(byteArray, Base64.DEFAULT)
}

fun Uri.convert(context: Context): ByteArray? {
    return context.contentResolver.openInputStream(this)?.readBytes()
}