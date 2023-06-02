package com.example.blackcoffer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import com.example.blackcoffer.databinding.ActivityRefineBinding
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class RefineActivity : AppCompatActivity() {
    private lateinit var binding:ActivityRefineBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityRefineBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //availability spinner
        val items = listOf("Available | Hey Let Us Connect","Away | Stay Discreet And Watch","Busy | Do Not Disturb | Will Catch Up Later","SOS | Emergency! Need Assistance! HELP")
        val adapter=ArrayAdapter(this,R.layout.custom_spinner_item,items)
        adapter.setDropDownViewResource(R.layout.custom_spinner_item)
        binding.availSpinner.adapter=adapter

        //when back button on toolbar is clicked
        setSupportActionBar(binding.topAppBar)
        binding.topAppBar.setNavigationOnClickListener{
            finish()
        }

       // after purpose chips are chicked
        binding.chipGroup.setOnCheckedStateChangeListener{ group,checkedId->
           for(i in 0 until binding.chipGroup.childCount){
               val chip=binding.chipGroup.getChildAt(i) as Chip
               if( chip.isChecked){
                   chip.setChipBackgroundColor(getColorStateList(R.color.blue))
                   chip.setTextColor(getColorStateList(R.color.white))
               }
               else{
                   chip.setChipBackgroundColor(getColorStateList(R.color.white))
                   chip.setTextColor(getColorStateList(R.color.blue))
               }
           }

        }

    }


}