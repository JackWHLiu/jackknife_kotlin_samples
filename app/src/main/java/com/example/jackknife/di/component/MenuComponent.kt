package com.example.jackknife.di.component

import com.example.jackknife.MenuListActivity
import com.example.jackknife.di.module.MenuModule
import dagger.Component

/**
 * 菜单组件。
 */
@Component(modules = arrayOf(MenuModule::class), dependencies = arrayOf(AppComponent::class))
interface MenuComponent {

    fun inject(activity: MenuListActivity)
}