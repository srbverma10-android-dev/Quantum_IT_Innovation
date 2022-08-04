package com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.fragment

import com.sourabhverma.quantumitinnovation.R
import com.sourabhverma.quantumitinnovation.base.fragment.BaseFragment
import com.sourabhverma.quantumitinnovation.base.viewmodel.BaseViewModel
import com.sourabhverma.quantumitinnovation.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding, BaseViewModel>() {
    override fun getLayoutId(): Int = R.layout.fragment_login

    override fun getViewModel(): Class<BaseViewModel> = BaseViewModel::class.java
}