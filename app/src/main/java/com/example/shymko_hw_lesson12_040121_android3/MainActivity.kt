package com.example.shymko_hw_lesson12_040121_android3

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.shymko_hw_lesson12_040121_android3.databinding.ActivityMainBinding

/*
Самостійно зробити проект, у якому буде чотири кнопки:

Показ AlertDialog
Показ DialogFragment
Показ BottomSheet зрболенний через xml
Показ BottomSheet як наслідника BottomSheetDialogFragment
*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        setupBinding()
        setupOnClickListeners()

    }

    private lateinit var binding: ActivityMainBinding

    private fun setupBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setupOnClickListeners() {
        binding.btnAlertDialog.setOnClickListener {
            setupDialogs()
        }

        binding.btnDialogFragment.setOnClickListener {
            showCustomDialogFragment()
        }

        binding.btnPageWithBottomSheet1.setOnClickListener {
            FirstButtomSheetActivity.start(this)
        }
    }


    private fun setupDialogs() {
        val addAlertDialog = AlertDialog.Builder(this)
        addAlertDialog.setTitle("Customer Title")
                .setMessage("Custom message")
                .setIcon(R.drawable.ic_baseline_two_wheeler_24)
                .setPositiveButton("Positive btn"){ dialog, which ->
                }
                .setNegativeButton("Negative btn"){ dialog, which ->
                }
                .show()
    }

    private fun showCustomDialogFragment(){
        supportFragmentManager.beginTransaction()
                .add(CustomDialogFragment(), "TAG")
                .commitAllowingStateLoss()

    }


}