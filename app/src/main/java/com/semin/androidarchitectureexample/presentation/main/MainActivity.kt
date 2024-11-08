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

                etUserName.setText(user.name)
                etUserAge.setText(user.age.toString())
                etUserGender.setText(user.gender.toString())
            }
        }

        lifecycleScope.launch {
            viewModel.rewardUiState.collect { reward ->
                tvReward.text = reward.toString()

                etRewardName.setText(reward.name)
                etRewardPrice.setText(reward.price.toString())
                etRewardExpiredDate.setText(reward.expiredDate.toString())
            }
        }

        buttonUserName.setOnClickListener {
            viewModel.updateUserName(etUserName.text.toString())
        }

        buttonUserAge.setOnClickListener {
            viewModel.updateUserAge(etUserAge.text.toString().toInt())
        }

        buttonUserGender.setOnClickListener {
            viewModel.updateUserGender(etUserGender.text.toString().toInt())
        }

        buttonUserClear.setOnClickListener {
            viewModel.clearUser()
        }

        buttonRewardName.setOnClickListener {
            viewModel.updateRewardName(etRewardName.text.toString())
        }

        buttonRewardPrice.setOnClickListener {
            viewModel.updateRewardPrice(etRewardPrice.text.toString().toInt())
        }

        buttonRewardExpiredDate.setOnClickListener {
            viewModel.updateRewardExpiredDate(etRewardExpiredDate.text.toString().toLong())
        }

        buttonRewardClear.setOnClickListener {
            viewModel.clearReward()
        }
    }
}