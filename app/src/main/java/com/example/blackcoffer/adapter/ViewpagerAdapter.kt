package com.example.blackcoffer.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.blackcoffer.fragments.BusinessFragment
import com.example.blackcoffer.fragments.MerchantFragment
import com.example.blackcoffer.fragments.PersonalFragment

class ViewpagerAdapter(fragmentManager: FragmentManager,lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
       return when(position){
           0->PersonalFragment()
           1->BusinessFragment()
           2->MerchantFragment()
           else->Fragment()
       }
    }
}