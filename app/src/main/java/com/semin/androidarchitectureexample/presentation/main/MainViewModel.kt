package com.semin.androidarchitectureexample.presentation.main

import androidx.lifecycle.ViewModel
import com.semin.androidarchitectureexample.domain.reward.repository.RewardRepository
import com.semin.androidarchitectureexample.domain.user.repository.UserRepository

class MainViewModel(
    private val userRepository: UserRepository,
    private val rewardRepository: RewardRepository
): ViewModel() {

}