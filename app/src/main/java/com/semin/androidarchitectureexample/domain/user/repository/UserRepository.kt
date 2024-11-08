package com.semin.androidarchitectureexample.domain.user.repository

import com.semin.androidarchitectureexample.domain.reward.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getUser(): Flow<User>
    suspend fun updateName(name: String)
    suspend fun updateAge(age: Int)
    suspend fun updateGender(gender: Int)
    suspend fun clearUser()
}