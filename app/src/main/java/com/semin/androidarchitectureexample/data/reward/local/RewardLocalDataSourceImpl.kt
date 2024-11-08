package com.semin.androidarchitectureexample.data.reward.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.semin.androidarchitectureexample.data.common.datastore.PreferencesKey
import com.semin.androidarchitectureexample.domain.reward.model.Reward
import com.semin.androidarchitectureexample.domain.reward.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class RewardLocalDataSourceImpl(
    private val prefDataStore: DataStore<Preferences>,
) : RewardLocalDataSource {
    override fun getReward(): Flow<Reward> {
        return prefDataStore.data.map { pref ->
            Reward(
                name = pref[PreferencesKey.Reward.NAME] ?: Reward.default.name,
                price = pref[PreferencesKey.Reward.PRICE] ?: Reward.default.price,
                expiredDate = pref[PreferencesKey.Reward.EXPIRED_DATE] ?: Reward.default.expiredDate,
            )
        }
    }

    override suspend fun updateName(name: String) {
        prefDataStore.edit { pref ->
            pref[PreferencesKey.Reward.NAME] = name
        }
    }

    override suspend fun updatePrice(price: Int) {
        prefDataStore.edit { pref ->
            pref[PreferencesKey.Reward.PRICE] = price
        }
    }

    override suspend fun updateExpiredDate(expiredDate: Long) {
        prefDataStore.edit { pref ->
            pref[PreferencesKey.Reward.EXPIRED_DATE] = expiredDate
        }
    }

    override suspend fun clearReward() {
        prefDataStore.edit { pref ->
            pref.remove(PreferencesKey.Reward.NAME)
            pref.remove(PreferencesKey.Reward.PRICE)
            pref.remove(PreferencesKey.Reward.EXPIRED_DATE)
        }
    }
}