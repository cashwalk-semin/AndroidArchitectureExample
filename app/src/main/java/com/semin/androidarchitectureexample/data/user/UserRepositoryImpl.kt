package com.semin.androidarchitectureexample.data.user

import com.semin.androidarchitectureexample.data.user.local.UserLocalDataSource
import com.semin.androidarchitectureexample.data.user.remote.UserRemoteDataSource
import com.semin.androidarchitectureexample.domain.user.model.User
import com.semin.androidarchitectureexample.domain.user.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class UserRepositoryImpl(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
): UserRepository {
    override fun getUser(): Flow<User> {
        return localDataSource.getUser()
    }

    override suspend fun updateName(name: String) {
        localDataSource.updateName(name)
    }

    override suspend fun updateAge(age: Int) {
        localDataSource.updateAge(age)
    }

    override suspend fun updateGender(gender: Int) {
        localDataSource.updateGender(gender)
    }

    override suspend fun clearUser() {
        localDataSource.clearUser()
    }
}