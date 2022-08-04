package com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.activity

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.sourabhverma.quantumitinnovation.R
import com.sourabhverma.quantumitinnovation.base.activity.BaseActivity
import com.sourabhverma.quantumitinnovation.base.viewmodel.BaseViewModel
import com.sourabhverma.quantumitinnovation.databinding.ActivitySignUpOrLogInBinding
import com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.adapters.ViewPagerAdapter

class SignUpOrLogInActivity : BaseActivity<ActivitySignUpOrLogInBinding, BaseViewModel> (){
    override fun getLayoutId(): Int = R.layout.activity_sign_up_or_log_in

    override fun getViewModel(): Class<BaseViewModel> = BaseViewModel::class.java

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setTabLayout()

    }

    private fun setTabLayout() {

        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Login"))
        binding.tabLayout.addTab(binding.tabLayout.newTab().setText("Sign Up"))

        binding.viewPager.adapter = ViewPagerAdapter(this)

        binding.tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                binding.viewPager.currentItem = tab?.position!!
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {
            }
        })

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tabLayout.selectTab(binding.tabLayout.getTabAt(position))
            }
        })

    }

}