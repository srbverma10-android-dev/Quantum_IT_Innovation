package com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.fragment

import com.sourabhverma.quantumitinnovation.R
import com.sourabhverma.quantumitinnovation.base.fragment.BaseFragment
import com.sourabhverma.quantumitinnovation.base.viewmodel.BaseViewModel
import com.sourabhverma.quantumitinnovation.databinding.ActivitySignUpOrLogInBinding

class SignUpFragment : BaseFragment<ActivitySignUpOrLogInBinding, BaseViewModel>() {
    override fun getLayoutId(): Int = R.layout.fragment_sign_up

    override fun getViewModel(): Class<BaseViewModel> = BaseViewModel::class.java

}