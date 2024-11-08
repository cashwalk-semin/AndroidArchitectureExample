package com.semin.androidarchitectureexample.app.di

import com.semin.androidarchitectureexample.data.common.datastore.rewardPrefDataStore
import com.semin.androidarchitectureexample.data.common.datastore.userPrefDataStore
import com.semin.androidarchitectureexample.data.reward.RewardDataSource
import com.semin.androidarchitectureexample.data.reward.RewardRepositoryImpl
import com.semin.androidarchitectureexample.data.reward.local.RewardLocalDataSource
import com.semin.androidarchitectureexample.data.reward.remote.RewardRemoteDataSource
import com.semin.androidarchitectureexample.data.user.UserDataSource
import com.semin.androidarchitectureexample.data.user.UserRepositoryImpl
import com.semin.androidarchitectureexample.data.user.local.UserLocalDataSource
import com.semin.androidarchitectureexample.data.user.remote.UserRemoteDataSource
import com.semin.androidarchitectureexample.domain.repository.reward.RewardRepository
import com.semin.androidarchitectureexample.domain.repository.user.UserRepository
import com.semin.androidarchitectureexample.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module

val dataModule = module {
    single<UserDataSource>(named("UserLocalDataSource")) { UserLocalDataSource(androidContext().userPrefDataStore) }
    single<UserDataSource>(named("UserRemoteDataSource")) { UserRemoteDataSource() }
    single<RewardDataSource>(named("RewardLocalDataSource")) { RewardLocalDataSource(androidContext().rewardPrefDataStore) }
    single<RewardDataSource>(named("RewardRemoteDataSource")) { RewardRemoteDataSource() }
}

val domainModule = module {
    single<UserRepository> { UserRepositoryImpl(get(), get()) }
    single<RewardRepository> { RewardRepositoryImpl(get(), get()) }
}

val presentationModule = module {
    viewModel<MainViewModel> { MainViewModel(get(), get()) }
}