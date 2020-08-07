package site.doramusic.app.util

import android.app.Activity
import android.widget.Toast
import com.alibaba.android.arouter.facade.Postcard
import com.alibaba.android.arouter.launcher.ARouter

fun Activity.open(path: String, build: Postcard.()-> Unit = {}) {
    val postcard = ARouter.getInstance().build(path)
    postcard.build()
    postcard.navigation()
}

fun Activity.openWithFinish(path: String, build: Postcard.()-> Unit = {}) {
    open(path, build)
    finish()
}

fun Activity.toast(tips: String) {
    Toast.makeText(this, tips, Toast.LENGTH_SHORT).show()
}