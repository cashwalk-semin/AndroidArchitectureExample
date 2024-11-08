package com.semin.androidarchitectureexample.presentation.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.semin.androidarchitectureexample.domain.reward.model.User
import com.semin.androidarchitectureexample.domain.reward.repository.RewardRepository
import com.semin.androidarchitectureexample.domain.user.repository.UserRepository
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch

class MainViewModel(
    private val userRepository: UserRepository,
    private val rewardRepository: RewardRepository,
) : ViewModel() {
    val userUiState = userRepository.getUser().stateIn(viewModelScope, SharingStarted.Eagerly, User.default)

    fun updateName(name: String) {
        viewModelScope.launch {
            userRepository.updateName(name)
        }
    }

    fun updateAge(age: Int) {
        viewModelScope.launch {
            userRepository.updateAge(age)
        }
    }

    fun updateGender(gender: Int) {
        viewModelScope.launch {
            userRepository.updateGender(gender)
        }
    }

    fun clearUser() {
        viewModelScope.launch {
            userRepository.clearUser()
        }
    }
}