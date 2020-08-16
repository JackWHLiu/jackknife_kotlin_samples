package com.example.jackknife

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.databinding.ActivityIntroduceBinding
import com.lwh.jackknife.BaseActivity

@Route(path = ARouterPath.ACTIVITY_INTRODUCE)
class IntroduceActivity : BaseActivity<ActivityIntroduceBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_introduce
    }

    override fun initData(savedInstanceState: Bundle?) {
        mBinding.introduce = "Android开发全家桶框架，https://github.com/JackWHLiu/jackknife"
    }
}