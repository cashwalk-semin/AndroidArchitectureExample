package com.semin.androidarchitectureexample.data.reward

import com.semin.androidarchitectureexample.data.reward.local.RewardLocalDataSource
import com.semin.androidarchitectureexample.data.reward.remote.RewardRemoteDataSource
import com.semin.androidarchitectureexample.domain.reward.model.Reward
import com.semin.androidarchitectureexample.domain.reward.repository.RewardRepository
import kotlinx.coroutines.flow.Flow

class RewardRepositoryImpl(
    private val localDataSource: RewardLocalDataSource,
    private val remoteDataSource: RewardRemoteDataSource,
) : RewardRepository {
    override fun getReward(): Flow<Reward> {
        return localDataSource.getReward()
    }

    override suspend fun updateName(name: String) {
        localDataSource.updateName(name)
    }

    override suspend fun updatePrice(price: Int) {
        localDataSource.updatePrice(price)
    }

    override suspend fun updateExpiredDate(expiredDate: Long) {
        localDataSource.updateExpiredDate(expiredDate)
    }

    override suspend fun clearReward() {
        localDataSource.clearReward()
    }
}