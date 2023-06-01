package com.example.blackcoffer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.blackcoffer.adapter.ViewpagerAdapter
import com.example.blackcoffer.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter=ViewpagerAdapter(this.supportFragmentManager,lifecycle)
        TabLayoutMediator(binding.tabLayout,binding.viewPager){
            tab,position->
            when(position){
                0->tab.text="PERSONAL"
                1-> tab.text="BUSINESS"
                2-> tab.text="MERCHANT"
            }
        }.attach()
    }
}