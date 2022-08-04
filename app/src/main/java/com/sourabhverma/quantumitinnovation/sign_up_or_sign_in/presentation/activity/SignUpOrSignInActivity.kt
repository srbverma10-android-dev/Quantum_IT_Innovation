package com.sourabhverma.quantumitinnovation.sign_up_or_sign_in.presentation.activity

import com.sourabhverma.quantumitinnovation.R
import com.sourabhverma.quantumitinnovation.base.activity.BaseActivity
import com.sourabhverma.quantumitinnovation.base.viewmodel.BaseViewModel
import com.sourabhverma.quantumitinnovation.databinding.ActivitySignUpOrSignInBinding

class SignUpOrSignInActivity : BaseActivity<ActivitySignUpOrSignInBinding, BaseViewModel> (){
    override fun getLayoutId(): Int = R.layout.activity_sign_up_or_sign_in

    override fun getViewModel(): Class<BaseViewModel> = BaseViewModel::class.java

}