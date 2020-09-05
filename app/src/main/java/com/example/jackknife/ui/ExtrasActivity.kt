package com.example.jackknife.ui

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.ARouterPath
import com.example.jackknife.R
import com.example.jackknife.databinding.ActivityExtrasBinding
import com.example.jackknife.open
import com.lwh.jackknife.BaseActivity

@Route(path = ARouterPath.ACTIVITY_EXTRAS)
class ExtrasActivity : BaseActivity<ActivityExtrasBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_extras
    }

    override fun initData(savedInstanceState: Bundle?) {
        open(ARouterPath.ACTIVITY_WEB_VIEW) {
            withString("url", "https://github.com/JackWHLiu");
        }
    }
}