package com.example.jackknife;

/**
 * 这是一张本游乐园全景地图，可以告诉你哪个地方怎么走。
 */
public interface ARouterPath {

    String GROUP_JK = "/JK";
    String ACTIVITY_INTRODUCE = GROUP_JK + "/IntroduceActivity";
    String ACTIVITY_MENU_LIST = GROUP_JK + "/MenuListActivity";
    String ACTIVITY_REQUEST_PERMISSION = GROUP_JK + "/RequestPermissionActivity";
    String ACTIVITY_BUGS_KILLER = GROUP_JK + "/BugsKillerActivity";
    String ACTIVITY_WEB_VIEW = GROUP_JK + "/WebViewActivity";
    String ACTIVITY_EXTRAS = GROUP_JK + "/ExtrasActivity";
    String ACTIVITY_TIPS = GROUP_JK + "/TipsActivity";
    String ACTIVITY_BITMAP = GROUP_JK + "/BitmapActivity";
    String ACTIVITY_BOTTOM_MENU = GROUP_JK + "/BottomMenuActivity";
    String ACTIVITY_TEST = GROUP_JK + "/TestActivity";
}
