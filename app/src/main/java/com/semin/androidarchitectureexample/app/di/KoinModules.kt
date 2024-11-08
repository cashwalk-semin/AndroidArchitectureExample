package com.semin.androidarchitectureexample.app.di

import com.semin.androidarchitectureexample.data.common.datastore.rewardPrefDataStore
import com.semin.androidarchitectureexample.data.common.datastore.userPrefDataStore
import com.semin.androidarchitectureexample.data.reward.RewardRepositoryImpl
import com.semin.androidarchitectureexample.data.reward.local.RewardLocalDataSource
import com.semin.androidarchitectureexample.data.reward.local.RewardLocalDataSourceImpl
import com.semin.androidarchitectureexample.data.reward.remote.RewardRemoteDataSource
import com.semin.androidarchitectureexample.data.reward.remote.RewardRemoteDataSourceImpl
import com.semin.androidarchitectureexample.data.user.UserRepositoryImpl
import com.semin.androidarchitectureexample.data.user.local.UserLocalDataSource
import com.semin.androidarchitectureexample.data.user.local.UserLocalDataSourceImpl
import com.semin.androidarchitectureexample.data.user.remote.UserRemoteDataSource
import com.semin.androidarchitectureexample.data.user.remote.UserRemoteDataSourceImpl
import com.semin.androidarchitectureexample.domain.reward.repository.RewardRepository
import com.semin.androidarchitectureexample.domain.user.repository.UserRepository
import com.semin.androidarchitectureexample.presentation.main.MainViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val dataModule = module {
    single<UserLocalDataSource> { UserLocalDataSourceImpl(androidContext().userPrefDataStore) }
    single<UserRemoteDataSource> { UserRemoteDataSourceImpl() }
    single<RewardLocalDataSource> { RewardLocalDataSourceImpl(androidContext().rewardPrefDataStore) }
    single<RewardRemoteDataSource> { RewardRemoteDataSourceImpl() }
}

val domainModule = module {
    single<UserRepository> { UserRepositoryImpl(get(), get()) }
    single<RewardRepository> { RewardRepositoryImpl(get(), get()) }
}

val presentationModule = module {
    viewModel<MainViewModel> { MainViewModel(get(), get()) }
}