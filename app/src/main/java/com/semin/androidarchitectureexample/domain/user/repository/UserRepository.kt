package com.semin.androidarchitectureexample.domain.user.repository

import com.semin.androidarchitectureexample.domain.user.model.User
import kotlinx.coroutines.flow.Flow

/**
 *  반환형이 Flow<*>인 경우는 suspend를 명시하지 않음.
 *  Flow의 collect가 suspend이기 때문
 *
 *  그 외 update, delete, insert는 suspend를 명시
 */
interface UserRepository {
    fun getUser(): Flow<User>
    suspend fun updateName(name: String)
    suspend fun updateAge(age: Int)
    suspend fun updateGender(gender: Int)
    suspend fun clearUser()
}