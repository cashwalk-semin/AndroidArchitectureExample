package com.semin.androidarchitectureexample.data.user

import com.semin.androidarchitectureexample.domain.repository.user.UserRepository

class UserRepositoryImpl(
    private val localDataSource: UserDataSource,
    private val remoteDataSource: UserDataSource
): UserRepository {

}