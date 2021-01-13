package com.example.shymko_hw_lesson12_040121_android3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.shymko_hw_lesson12_040121_android3.databinding.ActivityFirstButtomSheetBinding

class FirstButtomSheetActivity : AppCompatActivity() {

    // Creating a function for simple starting this activity
    companion object {
        fun start(context: Context) {
            context.startActivity((Intent(context, FirstButtomSheetActivity::class.java)))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_buttom_sheet)
        setupBinding()
        setupOnClickListeners()
    }

    private lateinit var binding: ActivityFirstButtomSheetBinding

    private fun setupBinding() {
        binding = ActivityFirstButtomSheetBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupOnClickListeners() {
        binding.btnPageWithBottomSheet2.setOnClickListener {
            SecondButtomSheetActivity.start(this)
        }
    }
}