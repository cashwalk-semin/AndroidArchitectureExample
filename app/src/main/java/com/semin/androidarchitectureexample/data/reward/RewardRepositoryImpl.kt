package com.semin.androidarchitectureexample.data.reward

import com.semin.androidarchitectureexample.domain.repository.reward.RewardRepository

class RewardRepositoryImpl(
    private val localDataSource: RewardDataSource,
    private val remoteDataSource: RewardDataSource,
) : RewardRepository {
}