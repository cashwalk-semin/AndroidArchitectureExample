package com.semin.androidarchitectureexample.data.user.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import com.semin.androidarchitectureexample.data.user.UserDataSource

class UserLocalDataSource(
    private val prefDataStore: DataStore<Preferences>,
) : UserDataSource {
}