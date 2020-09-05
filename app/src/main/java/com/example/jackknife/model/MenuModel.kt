package com.example.jackknife.model

import android.graphics.Color
import com.example.jackknife.ARouterPath
import com.example.jackknife.bean.Menu

/**
 * 先生，您要来点什么？以下就是本游乐园所有支持的功能哦！
 */
class MenuModel {

    /**
     * 不同的颜色代表不同的板块哦，比如：
     * MAGENTA（紫色）：代表导游
     * GRAY（灰色）：代表MVVM
     * GREEN（绿色）：代表自定义控件
     * BLACK（黑色）：代表音视频
     */
    fun loadMenus(): MutableList<Menu> {
        return mutableListOf(
            Menu(Color.MAGENTA, "游乐园简介", ARouterPath.ACTIVITY_INTRODUCE),
            Menu(Color.MAGENTA, "Star收藏一下不迷路", ARouterPath.ACTIVITY_WEB_VIEW),
            Menu(Color.GREEN, "从底部弹出的菜单面板", ARouterPath.ACTIVITY_BOTTOM_MENU),
            Menu(Color.GRAY, "有用的小提示", ARouterPath.ACTIVITY_TIPS),
            Menu(Color.GRAY, "图像变换", ARouterPath.ACTIVITY_BITMAP),
            Menu(Color.GRAY, "运行时权限申请", ARouterPath.ACTIVITY_REQUEST_PERMISSION),
            Menu(Color.GRAY, "多通道崩溃信息收集", ARouterPath.ACTIVITY_BUGS_KILLER),
            Menu(Color.GRAY, "Intent传参", ARouterPath.ACTIVITY_EXTRAS)
        )
    }
}