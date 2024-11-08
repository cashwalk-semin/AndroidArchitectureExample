package com.semin.androidarchitectureexample.presentation.main

import androidx.lifecycle.lifecycleScope
import com.semin.androidarchitectureexample.R
import com.semin.androidarchitectureexample.databinding.ActivityMainBinding
import com.semin.androidarchitectureexample.presentation.base.BaseActivity
import kotlinx.coroutines.launch
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>(layoutId = R.layout.activity_main) {
    private val viewModel: MainViewModel by viewModel()

    override fun ActivityMainBinding.initView() {
        lifecycleScope.launch {

            viewModel.userUiState.collect { user ->
                tvUser.text = user.toString()

                etName.setText(user.name)
                etAge.setText(user.age.toString())
                etGender.setText(user.gender.toString())
            }
        }

        buttonName.setOnClickListener {
            viewModel.updateName(etName.text.toString())
        }

        buttonAge.setOnClickListener {
            viewModel.updateAge(etAge.text.toString().toInt())
        }

        buttonGender.setOnClickListener {
            viewModel.updateGender(etGender.text.toString().toInt())
        }

        buttonClear.setOnClickListener {
            viewModel.clearUser()
        }
    }
}