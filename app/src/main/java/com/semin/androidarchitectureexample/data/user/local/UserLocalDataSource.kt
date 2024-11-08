package com.semin.androidarchitectureexample.data.user.local

import com.semin.androidarchitectureexample.domain.reward.model.User
import kotlinx.coroutines.flow.Flow

interface UserLocalDataSource {
    fun getUser(): Flow<User>
    suspend fun updateName(name: String)
    suspend fun updateAge(age: Int)
    suspend fun updateGender(gender: Int)
    suspend fun clearUser()
}