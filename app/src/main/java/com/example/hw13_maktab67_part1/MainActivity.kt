package com.example.hw13_maktab67_part1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.example.hw13_maktab67_part1.home.HomeUi
import com.example.hw13_maktab67_part1.home.HomeUiState
import com.example.hw13_maktab67_part1.profile.ProfileUi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace(R.id.container, ProfileUi())
            setReorderingAllowed(true)
        }

    }
}