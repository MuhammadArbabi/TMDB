package com.della.hassintmdbtask

import android.app.Application
import com.della.hassintmdbtask.BuildConfig
import timber.log.Timber

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        if(BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }
}