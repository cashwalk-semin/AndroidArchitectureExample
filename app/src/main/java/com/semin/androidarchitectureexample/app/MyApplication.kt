package com.semin.androidarchitectureexample.app

import android.app.Application
import com.semin.androidarchitectureexample.app.di.dataModule
import com.semin.androidarchitectureexample.app.di.domainModule
import com.semin.androidarchitectureexample.app.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@MyApplication)
            modules(dataModule, domainModule, presentationModule)
        }
    }
}