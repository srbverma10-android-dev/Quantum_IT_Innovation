package com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.adapters

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.fragment.LoginFragment
import com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.fragment.SignUpFragment

class ViewPagerAdapter(activity : AppCompatActivity) : FragmentStateAdapter(activity) {

    private val fragmentList = listOf<Fragment>(LoginFragment(), SignUpFragment())

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment = fragmentList[position]
    
}