package com.example.jackknife

import android.app.Application
import android.content.Context
import androidx.fragment.app.FragmentManager
import com.lwh.jackknife.ApplicationLifecycleCallbacks
import com.lwh.jackknife.GlobalConfig

/**
 * 追加GlobalConfig配置，只要使用了com.lwh.jackknife.BaseApplication，就会加载默认配置DefaultGlobalConfig，
 * 用于打印生命周期的日志。GlobalConfig可以配置多个哦！同样的，需要GlobalConfig生效，需要在AndroidManifest.xml中的application标签配置
 * com.lwh.jackknife.BaseApplication。
 */
class ARouterGlobalConfig : GlobalConfig {

    override fun injectApplicationLifecycle(
        context: Context?,
        lifecycles: MutableList<ApplicationLifecycleCallbacks>?
    ) {
        lifecycles!!.add(AppLifecycle())
    }

    override fun injectFragmentLifecycle(
        context: Context?,
        lifecycles: MutableList<FragmentManager.FragmentLifecycleCallbacks>?
    ) {
    }

    override fun injectActivityLifecycle(
        context: Context?,
        lifecycles: MutableList<Application.ActivityLifecycleCallbacks>?
    ) {
        lifecycles!!.add(ActivityLifecycle())
    }
}