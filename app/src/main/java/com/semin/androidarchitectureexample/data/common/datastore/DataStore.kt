package com.semin.androidarchitectureexample.data.common.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.preferencesDataStore

val Context.userPrefDataStore: DataStore<Preferences> by preferencesDataStore(PrefDataStore.USER)
val Context.rewardPrefDataStore: DataStore<Preferences> by preferencesDataStore(PrefDataStore.REWARD)

object PrefDataStore {
    const val USER = "user"
    const val REWARD = "reward"
}

sealed interface PreferencesKey {
    data object User : PreferencesKey {

    }

    data object Reward : PreferencesKey {

    }
}
