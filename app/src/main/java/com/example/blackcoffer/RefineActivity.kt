package com.example.blackcoffer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.blackcoffer.databinding.ActivityRefineBinding
import com.google.android.material.chip.Chip

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

        //***********
//        binding.chipGroup.setOnCheckedStateChangeListener{ group,checkedId->
//            val chip:Chip? =group.findViewById(checkedId as Int)
//            chip?.setChipBackgroundColorResource(R.color.darkblue)
//
//        }
//        binding.matrimony.setChipBackgroundColor(getColorStateList(R.drawable.purpose_chips_bg))


    }
    override fun ch
}