package com.example.jackknife

import com.example.jackknife.di.component.AppComponent
import com.example.jackknife.di.component.DaggerAppComponent
import com.example.jackknife.di.module.AppModule
import com.lwh.jackknife.BaseApplication

/**
 * 继承com.lwh.jackknife.BaseApplication开始JackKnife之旅吧！如果你不使用这个BaseApplication，直接开始继承
 * com.lwh.jackknife.BaseActivity也是可以的，这样做的话，会丢失JackKnife对于app开发的一些优化。
 */
class SampleApp : BaseApplication() {

    /**
     * Dagger组件化依赖注入可以根据实际业务选择取舍。
     */
    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        val appModule = AppModule(this)
        appComponent = DaggerAppComponent.builder().appModule(appModule).build()
        appComponent.inject(this)
    }
}