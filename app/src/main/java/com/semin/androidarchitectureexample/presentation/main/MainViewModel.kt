package com.semin.androidarchitectureexample.presentation.main

import androidx.lifecycle.ViewModel
import com.semin.androidarchitectureexample.domain.repository.reward.RewardRepository
import com.semin.androidarchitectureexample.domain.repository.user.UserRepository

class MainViewModel(
    private val userRepository: UserRepository,
    private val rewardRepository: RewardRepository
): ViewModel() {

}