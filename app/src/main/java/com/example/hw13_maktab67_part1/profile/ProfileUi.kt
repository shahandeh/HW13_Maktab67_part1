package com.example.hw13_maktab67_part1.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.hw13_maktab67_part1.R
import com.example.hw13_maktab67_part1.databinding.UiProfileBinding

class ProfileUi : Fragment(R.layout.ui_profile) {

    private val profileUiState : ProfileUiState by activityViewModels()

    lateinit var bind : UiProfileBinding

    val a = registerForActivityResult(ActivityResultContracts.TakePicturePreview()){
        profileUiState.imageView.value = it
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        bind = DataBindingUtil.inflate(inflater, R.layout.ui_profile, container, false)
        return bind.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bind.uiState = profileUiState

        bind.getImageView.setOnClickListener {
            takeImage()
        }

    }

    fun takeImage(){
        a.launch(null)
        profileUiState.imageView.observe(viewLifecycleOwner){
            if (it != null) profileUiState.upload(this)
        }
    }
}