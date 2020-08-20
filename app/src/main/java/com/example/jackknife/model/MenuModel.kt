package com.example.jackknife.model

import com.example.jackknife.ARouterPath
import com.example.jackknife.bean.Menu

class MenuModel {

    fun loadMenus(): MutableList<Menu> {
        return mutableListOf(
            Menu(0, "简介", ARouterPath.ACTIVITY_INTRODUCE),
            Menu(1, "运行时权限申请", ARouterPath.ACTIVITY_REQUEST_PERMISSION),
            Menu(2, "多通道崩溃信息收集", ARouterPath.ACTIVITY_BUGS_KILLER)
        )
    }
}