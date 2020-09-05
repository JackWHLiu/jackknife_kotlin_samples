package com.example.jackknife.di.module

import com.example.jackknife.model.MenuModel
import dagger.Module
import dagger.Provides

/**
 * 菜单模块。
 */
@Module
class MenuModule {

    @Provides
    fun provideMenuModel(): MenuModel {
        return MenuModel()
    }
}