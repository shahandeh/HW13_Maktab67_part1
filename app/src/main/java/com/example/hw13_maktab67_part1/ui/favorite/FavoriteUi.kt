package com.example.hw13_maktab67_part1.ui.favorite

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part1.R
import com.example.hw13_maktab67_part1.ui.home.HomeUiState

class FavoriteUi : Fragment(R.layout.ui_favorite) {

    private val favoriteUiState : FavoriteUiState by activityViewModels()
    lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerViewFavorite)

        recyclerView.adapter = FavoriteAdapter(favoriteUiState.getFavoriteList())


    }

}