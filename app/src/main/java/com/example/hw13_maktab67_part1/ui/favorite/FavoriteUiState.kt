package com.example.hw13_maktab67_part1.ui.favorite

import androidx.lifecycle.ViewModel
import com.example.hw13_maktab67_part1.repository.Movie
import com.example.hw13_maktab67_part1.repository.MovieDataSource

class FavoriteUiState : ViewModel() {

    private val movieList = MovieDataSource.movieList

    fun getFavoriteList() : MutableList<Movie> {
        val temp = mutableListOf<Movie>()
        for (i in movieList){
            if (i.isLiked) temp.add(i)
        }
        return temp
    }



}