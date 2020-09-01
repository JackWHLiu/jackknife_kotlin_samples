package com.example.jackknife.model

import com.example.jackknife.ARouterPath
import com.example.jackknife.bean.Menu

class MenuModel {

    fun loadMenus(): MutableList<Menu> {
        return mutableListOf(
            Menu(0, "简介", ARouterPath.ACTIVITY_INTRODUCE),
            Menu(1, "Github，欢迎Star！", ARouterPath.ACTIVITY_WEB_VIEW),
            Menu(2, "运行时权限申请", ARouterPath.ACTIVITY_REQUEST_PERMISSION),
            Menu(3, "多通道崩溃信息收集", ARouterPath.ACTIVITY_BUGS_KILLER),
            Menu(4, "Intent传参", ARouterPath.ACTIVITY_EXTRAS)
        )
    }
}