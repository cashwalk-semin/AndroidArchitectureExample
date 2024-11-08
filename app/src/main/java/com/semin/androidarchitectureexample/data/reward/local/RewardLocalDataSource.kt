package com.semin.androidarchitectureexample.data.reward.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.semin.androidarchitectureexample.data.reward.RewardDataSource

class RewardLocalDataSource(
    private val prefDataStore: DataStore<Preferences>,
) : RewardDataSource {
}