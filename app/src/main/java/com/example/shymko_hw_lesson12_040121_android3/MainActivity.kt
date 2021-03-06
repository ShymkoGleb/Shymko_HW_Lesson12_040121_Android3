package com.example.shymko_hw_lesson12_040121_android3


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import com.example.shymko_hw_lesson12_040121_android3.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

/*
Самостійно зробити проект, у якому буде чотири кнопки:

Показ AlertDialog
Показ DialogFragment
Показ BottomSheet зрболенний через xml
Показ BottomSheet як наслідника BottomSheetDialogFragment
*/


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupBinding()
        setupOnClickListeners()
    }

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

        binding.btnBottomSheet.setOnClickListener {
            showBottomSheetFragment()
        }

        binding.btnBottomSheetDialogFragment.setOnClickListener {
            showCustomButtomSheetDialogFragment()
        }



    }

    private fun setupDialogs() {
        val addAlertDialog = AlertDialog.Builder(this)
        addAlertDialog.setTitle("Customer Title")
                .setMessage("Custom message")
                .setIcon(R.drawable.ic_baseline_two_wheeler_24)
                .setPositiveButton("Positive btn") { dialog, which ->
                }
                .setNegativeButton("Negative btn") { dialog, which ->
                }
                .show()
    }

    private fun showCustomDialogFragment() {
        supportFragmentManager.beginTransaction()
                .add(CustomDialogFragment(), "TAG")
                .commitAllowingStateLoss()
    }

    private fun showBottomSheetFragment() {
        val dialog = BottomSheetDialog(this)
        val view = layoutInflater.inflate(R.layout.buttom_sheet_simpe_xml_example, null)
        dialog.setContentView(view)
        dialog.show()
    }

    private fun showCustomButtomSheetDialogFragment() {
        supportFragmentManager.beginTransaction()
                .add(CustomBottomSheetDialogFragment(), "TAG")
                .commitAllowingStateLoss()
    }

}
