package com.example.hw13_maktab67_part1.ui.profile

import android.graphics.Bitmap
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.result.contract.ActivityResultContracts
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.hw13_maktab67_part1.R
import com.example.hw13_maktab67_part1.databinding.UiProfileBinding
import com.example.hw13_maktab67_part1.util.glide

class ProfileUi : Fragment(R.layout.ui_profile) {

    private val profileUiState: ProfileUiState by activityViewModels()

    lateinit var bind: UiProfileBinding

    private lateinit var bitmap: Bitmap

    private val takePicturePreview =
        registerForActivityResult(ActivityResultContracts.TakePicturePreview()) { Bitmap ->
            bind.getImageView.setImageBitmap(Bitmap)
            bitmap = Bitmap
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
        bind.lifecycleOwner = this

        profileUiState.isRegistered.observe(viewLifecycleOwner) { isRegistered ->
            if (isRegistered) {
                bind.showImage.glide(profileUiState.imageUrl.toString())
                bind.getProfileLayout.visibility = View.GONE
                bind.showProfileLayout.visibility = View.VISIBLE
            }
        }

        bind.getImageView.setOnClickListener {
            takePicturePreview.launch(null)
        }

        bind.register.setOnClickListener {
            profileUiState.register(bitmap)
        }

    }

}