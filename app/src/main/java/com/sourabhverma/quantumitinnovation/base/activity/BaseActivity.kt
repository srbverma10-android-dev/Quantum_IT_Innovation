package com.sourabhverma.quantumitinnovation.base.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


abstract class BaseActivity<T : ViewDataBinding, VM : ViewModel> : AppCompatActivity() {

    lateinit var viewModel: VM
    lateinit var binding: T

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, getLayoutId())
        viewModel = ViewModelProvider(this).get(getViewModel())

    }

    abstract fun getLayoutId() : Int

    abstract fun getViewModel() : Class<VM>

}