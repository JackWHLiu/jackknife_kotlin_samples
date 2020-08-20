package com.example.jackknife

import com.example.jackknife.di.component.AppComponent
import com.example.jackknife.di.component.DaggerAppComponent
import com.example.jackknife.di.module.AppModule
import com.lwh.jackknife.BaseApplication

class SampleApp : BaseApplication() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        val appModule = AppModule(this)
        appComponent = DaggerAppComponent.builder().appModule(appModule).build()
        appComponent.inject(this)
    }
}