package com.example.jackknife

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.databinding.ActivityTipsBinding
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.util.ToastUtils
import kotlinx.android.synthetic.main.activity_tips.*

@Route(path = ARouterPath.ACTIVITY_TIPS)
class TipsActivity : BaseActivity<ActivityTipsBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_tips
    }

    override fun initData(savedInstanceState: Bundle?) {
        btn_tips_01.setOnClickListener {
            ToastUtils.showShort("ToastUtils.showShort()")
        }
        btn_tips_02.setOnClickListener {
            Thread {
                ToastUtils.showLong("ToastUtils.showLong()")
            }.start()
        }
    }
}