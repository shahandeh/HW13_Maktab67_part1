package com.example.hw13_maktab67_part1.ui.comingsoon

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.example.hw13_maktab67_part1.repository.ComingSoonDataSource
import com.example.hw13_maktab67_part1.repository.ComingSoonMovie

class ComingSoonUiState : ViewModel() {

    val listOfComingSoonMovie = ComingSoonDataSource.comingSoonMovie

    fun shareComingSoonMovie(position : Int) : Intent{
        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_SUBJECT, listOfComingSoonMovie[position].name)
        intent.putExtra(Intent.EXTRA_TEXT, listOfComingSoonMovie[position].url)
        intent.type = "text/plain"
        return intent
    }
}