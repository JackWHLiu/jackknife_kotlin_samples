package com.example.jackknife.model

import android.graphics.Color
import com.example.jackknife.ARouterPath
import com.example.jackknife.bean.Menu

class MenuModel {

    fun loadMenus(): MutableList<Menu> {
        return mutableListOf(
            Menu(Color.GRAY, "简介", ARouterPath.ACTIVITY_INTRODUCE),
            Menu(Color.GRAY, "Github，欢迎Star！", ARouterPath.ACTIVITY_WEB_VIEW),
            Menu(Color.GRAY, "有用的小提示", ARouterPath.ACTIVITY_TIPS),
            Menu(Color.GRAY, "图像变换", ARouterPath.ACTIVITY_BITMAP),
            Menu(Color.GRAY, "运行时权限申请", ARouterPath.ACTIVITY_REQUEST_PERMISSION),
            Menu(Color.RED, "多通道崩溃信息收集", ARouterPath.ACTIVITY_BUGS_KILLER),
            Menu(Color.GRAY, "Intent传参", ARouterPath.ACTIVITY_EXTRAS)
        )
    }
}