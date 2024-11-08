package com.semin.androidarchitectureexample.data.reward.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

class RewardLocalDataSourceImpl(
    private val prefDataStore: DataStore<Preferences>,
) : RewardLocalDataSource {
}