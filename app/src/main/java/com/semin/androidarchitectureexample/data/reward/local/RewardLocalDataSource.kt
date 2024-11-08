package com.semin.androidarchitectureexample.data.reward.local

import com.semin.androidarchitectureexample.domain.reward.model.Reward
import kotlinx.coroutines.flow.Flow

interface RewardLocalDataSource {
    fun getReward(): Flow<Reward>
    suspend fun updateName(name: String)
    suspend fun updatePrice(price: Int)
    suspend fun updateExpiredDate(expiredDate: Long)
    suspend fun clearReward()
}