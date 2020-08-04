package com.example.jackknife

import android.app.Application
import android.content.Context
import com.alibaba.android.arouter.launcher.ARouter
import com.lwh.jackknife.ApplicationLifecycleCallbacks

class AppLifecycle : ApplicationLifecycleCallbacks {

    override fun attachBaseContext(base: Context?) {
    }

    override fun onCreate(application: Application?) {
        ARouter.init(application)
    }

    override fun onTerminate(application: Application?) {
    }
}