package com.semin.androidarchitectureexample.data.common.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

val Context.userPrefDataStore: DataStore<Preferences> by preferencesDataStore(PrefDataStore.USER)
val Context.rewardPrefDataStore: DataStore<Preferences> by preferencesDataStore(PrefDataStore.REWARD)

object PrefDataStore {
    const val USER = "user"
    const val REWARD = "reward"
}

sealed interface PreferencesKey {
    data object User : PreferencesKey {
        val NAME = stringPreferencesKey("user_name")
        val AGE = intPreferencesKey("user_age")
        val GENDER = intPreferencesKey("user_gender")
    }

    data object Reward : PreferencesKey {
        val NAME = stringPreferencesKey("reward_name")
        val PRICE = intPreferencesKey("reward_price")
        val EXPIRED_DATE = longPreferencesKey("reward_expired_date")
    }
}
