package com.semin.androidarchitectureexample.data.reward

import com.semin.androidarchitectureexample.data.reward.local.RewardLocalDataSource
import com.semin.androidarchitectureexample.data.reward.remote.RewardRemoteDataSource
import com.semin.androidarchitectureexample.domain.reward.repository.RewardRepository

class RewardRepositoryImpl(
    private val localDataSource: RewardLocalDataSource,
    private val remoteDataSource: RewardRemoteDataSource,
) : RewardRepository {
}