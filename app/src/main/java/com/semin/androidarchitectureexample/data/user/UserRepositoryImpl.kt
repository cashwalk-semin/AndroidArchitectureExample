package com.semin.androidarchitectureexample.data.user

import com.semin.androidarchitectureexample.data.user.local.UserLocalDataSource
import com.semin.androidarchitectureexample.data.user.remote.UserRemoteDataSource
import com.semin.androidarchitectureexample.domain.user.repository.UserRepository

class UserRepositoryImpl(
    private val localDataSource: UserLocalDataSource,
    private val remoteDataSource: UserRemoteDataSource
): UserRepository {

}