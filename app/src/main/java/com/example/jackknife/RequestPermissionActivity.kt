package com.example.jackknife

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.ARouterPath
import com.example.jackknife.R
import com.example.jackknife.databinding.ActivityRequestPermissionBinding
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.permission.PermissionManager
import com.lwh.jackknife.permission.runtime.Permission
import site.doramusic.app.util.toast

/**
 * Android6.0以上申请运行时权限。
 */
@Route(path = ARouterPath.ACTIVITY_REQUEST_PERMISSION)
class RequestPermissionActivity : BaseActivity<ActivityRequestPermissionBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_request_permission
    }

    override fun initData(savedInstanceState: Bundle?) {
        //权限申请API
        PermissionManager
            .with(this)
            .runtime()
            .permission(Permission.WRITE_EXTERNAL_STORAGE, Permission.RECORD_AUDIO)
            .onGranted() {
                toast("已授予权限")
            }
            .onDenied {
                toast("权限被拒绝")
            }
            .start()
    }
}