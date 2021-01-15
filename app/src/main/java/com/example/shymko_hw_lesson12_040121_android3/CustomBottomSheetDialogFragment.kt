package com.example.shymko_hw_lesson12_040121_android3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.shymko_hw_lesson12_040121_android3.databinding.BotomSheetDialogFragmentBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class CustomBottomSheetDialogFragment : BottomSheetDialogFragment() {

    private lateinit var binding: BotomSheetDialogFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = BotomSheetDialogFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }


}