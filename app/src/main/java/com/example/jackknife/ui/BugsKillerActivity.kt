package com.example.jackknife.ui

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.ARouterPath
import com.example.jackknife.R
import com.example.jackknife.databinding.ActivityBugsKillerBinding
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.bugskiller.DoraConfig
import com.lwh.jackknife.bugskiller.StoragePolicy
import com.lwh.jackknife.permission.runtime.Permission
import kotlinx.android.synthetic.main.activity_bugs_killer.*

@Route(path = ARouterPath.ACTIVITY_BUGS_KILLER)
class BugsKillerActivity : BaseActivity<ActivityBugsKillerBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_bugs_killer
    }

    override fun initData(savedInstanceState: Bundle?) {
        // StoragePolicy使用之前要申请存储权限，我这里在requirePermissions()中配置了需要的权限
        DoraConfig.Builder(this)
            .crashReportPolicy(StoragePolicy("YourApp/crash"))//可以嵌套配置多种策略
            .build()
        btn_crash.setOnClickListener {
            1 / 0 //开始搞事情了，哈哈，闪退吧！
        }
    }

    // 这个方法的返回值决定是否直接调用initData()方法，如果没有要求权限则直接调用initData()方法，如果有要求权限，
    // 则在用户授予相关权限后再调用initData()方法。
    override fun requirePermissions(): Array<String> {
        return arrayOf(Permission.WRITE_EXTERNAL_STORAGE)
    }
}