package com.example.jackknife

import android.app.Activity
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.launcher.ARouter
import com.lwh.jackknife.util.ToastUtils

/**
 * 基于kotlin的扩展方法。
 */
fun Activity.open(path: String, build: Postcard.() -> Unit = {}) {
    val postcard = ARouter.getInstance().build(path)
    postcard.build()
    postcard.navigation()
}

fun Activity.openWithFinish(path: String, build: Postcard.() -> Unit = {}) {
    open(path, build)
    finish()
}

fun Activity.toast(tips: String) {
    ToastUtils.showShort(tips)
}