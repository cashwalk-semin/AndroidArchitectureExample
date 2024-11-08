package com.semin.androidarchitectureexample.presentation.main

import com.semin.androidarchitectureexample.R
import com.semin.androidarchitectureexample.databinding.ActivityMainBinding
import com.semin.androidarchitectureexample.presentation.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>(layoutId = R.layout.activity_main) {
    private val viewModel: MainViewModel by viewModel()

    override fun ActivityMainBinding.initView() {

    }
}