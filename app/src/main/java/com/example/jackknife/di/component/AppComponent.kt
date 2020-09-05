package com.example.jackknife.di.component

import android.app.Application
import com.example.jackknife.di.module.AppModule
import dagger.Component

/**
 * APP组件。
 */
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app: Application)
}