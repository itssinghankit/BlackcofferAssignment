package com.example.blackcoffer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import com.example.blackcoffer.adapter.ViewpagerAdapter
import com.example.blackcoffer.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var actionBarDrawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //to add tab layout text and connect viewpager adapter
        binding.viewPager.adapter=ViewpagerAdapter(this.supportFragmentManager,lifecycle)
        TabLayoutMediator(binding.tabLayout,binding.viewPager){
            tab,position->
            when(position){
                0->tab.text="PERSONAL"
                1-> tab.text="BUSINESS"
                2-> tab.text="MERCHANT"
            }
        }.attach()

        //to set up our drawer layout
        setUpDrawerLayout()

        //after refine is clicked
        binding.refine.setOnClickListener{
            val intent= Intent(this,RefineActivity::class.java)
            startActivity(intent)
        }

    }

    private fun setUpDrawerLayout() {
        setSupportActionBar(findViewById(R.id.topAppBar))
        actionBarDrawerToggle= ActionBarDrawerToggle(this,binding.drawerLayout,R.string.app_name,R.string.app_name)
        actionBarDrawerToggle.syncState()
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.navigation_icon)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(actionBarDrawerToggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}