package com.example.shymko_hw_lesson12_040121_android3

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SecondButtomSheetActivity : AppCompatActivity() {

    // Creating a function for simple starting this activity
    companion object {
        fun start(context: Context) {
            context.startActivity((Intent(context, SecondButtomSheetActivity::class.java)))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_buttom_sheet)
    }
}