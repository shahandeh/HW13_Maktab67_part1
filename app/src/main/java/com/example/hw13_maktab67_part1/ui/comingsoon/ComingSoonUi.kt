package com.example.hw13_maktab67_part1.ui.comingsoon

import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.recyclerview.widget.RecyclerView
import com.example.hw13_maktab67_part1.R

class ComingSoonUi : Fragment(R.layout.ui_comingsoon), Share {

    private val comingSoonUiState : ComingSoonUiState by activityViewModels()

    lateinit var recyclerViewComingSoon : RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerViewComingSoon = view.findViewById(R.id.recyclerViewComingSoon)
        recyclerViewComingSoon.adapter = ComingSoonMovieAdapter(comingSoonUiState.listOfComingSoonMovie, this)

    }

    override fun shareMovie(position: Int) {
        val intent = comingSoonUiState.shareComingSoonMovie(position)
        startActivity(Intent.createChooser(intent, "Coming Soon"))
    }

}