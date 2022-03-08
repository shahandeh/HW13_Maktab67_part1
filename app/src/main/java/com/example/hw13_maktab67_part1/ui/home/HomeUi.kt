package com.example.hw13_maktab67_part1.ui.home

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part1.R
import com.example.hw13_maktab67_part1.repository.Profile

class HomeUi : Fragment (R.layout.ui_home), MovieClick {

    private val homeUiState : HomeUiState by activityViewModels()
    lateinit var recyclerView: RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerViewHome)
        recyclerView.adapter = HomeAdapter(homeUiState.movieList, this)

    }

    override fun click(position : Int) {
        if (Profile.isRegistered) {
            homeUiState.favoriteManager(position)
            recyclerView.adapter?.notifyItemChanged(position)
        }
    }

}