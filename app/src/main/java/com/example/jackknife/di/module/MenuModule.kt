package com.example.jackknife.di.module

import com.example.jackknife.model.MenuModel
import dagger.Module
import dagger.Provides

@Module
class MenuModule {

    @Provides
    fun provideMenuModel(): MenuModel {
        return MenuModel()
    }
}