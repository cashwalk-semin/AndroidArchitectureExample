package com.semin.androidarchitectureexample.domain.reward.repository

import com.semin.androidarchitectureexample.domain.reward.model.Reward
import kotlinx.coroutines.flow.Flow

/**
 *  반환형이 Flow<*>인 경우는 suspend를 명시하지 않음.
 *  Flow의 collect가 suspend이기 때문
 *
 *  그 외 update, delete, insert는 suspend를 명시
 */
interface RewardRepository {
    fun getReward(): Flow<Reward>
    suspend fun updateName(name: String)
    suspend fun updatePrice(price: Int)
    suspend fun updateExpiredDate(expiredDate: Long)
    suspend fun clearReward()
}