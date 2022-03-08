package com.example.hw13_maktab67_part1.ui.home

import androidx.lifecycle.ViewModel
import com.example.hw13_maktab67_part1.repository.MovieDataSource

class HomeUiState : ViewModel() {

    val movieList = MovieDataSource.movieList

    fun favoriteManager(position : Int){
        movieList[position].isLiked = movieList[position].isLiked.not()
    }
}