package com.semin.androidarchitectureexample.data.user.local

import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import com.semin.androidarchitectureexample.data.common.datastore.PreferencesKey
import com.semin.androidarchitectureexample.domain.user.model.User
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class UserLocalDataSourceImpl(
    private val prefDataStore: DataStore<Preferences>,
) : UserLocalDataSource {

    override fun getUser(): Flow<User> {
        return prefDataStore.data.map { pref ->
            User(
                name = pref[PreferencesKey.User.NAME] ?: User.default.name,
                age = pref[PreferencesKey.User.AGE] ?: User.default.age,
                gender = pref[PreferencesKey.User.GENDER] ?: User.default.gender,
            )
        }
    }

    override suspend fun updateName(name: String) {
        prefDataStore.edit { pref ->
            pref[PreferencesKey.User.NAME] = name
        }
    }

    override suspend fun updateAge(age: Int) {
        prefDataStore.edit { pref ->
            pref[PreferencesKey.User.AGE] = age
        }
    }

    override suspend fun updateGender(gender: Int) {
        prefDataStore.edit { pref ->
            pref[PreferencesKey.User.GENDER] = gender
        }
    }

    override suspend fun clearUser() {
        prefDataStore.edit { pref ->
            pref.remove(PreferencesKey.User.NAME)
            pref.remove(PreferencesKey.User.AGE)
            pref.remove(PreferencesKey.User.GENDER)
        }
    }
}