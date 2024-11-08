package com.semin.androidarchitectureexample.data.user.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences

class UserLocalDataSourceImpl(
    private val prefDataStore: DataStore<Preferences>,
) : UserLocalDataSource {
}