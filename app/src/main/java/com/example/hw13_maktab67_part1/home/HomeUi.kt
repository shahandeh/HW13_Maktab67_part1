package com.example.hw13_maktab67_part1.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part1.R

class HomeUi : Fragment (R.layout.ui_home) {

    val homeUiState : HomeUiState by activityViewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerViewHome)
        recyclerView.adapter = HomeAdapter(homeUiState.movieList)

    }

}