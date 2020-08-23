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
        mBinding.introduce = "Android开发全家桶框架，https://github.com/JackWHLiu/jackknife。 JackKnife，" +
                "以下使用JK。JK支持Java和Kotlin语言的Android开发，致力于帮助你打造一款高质量的Android App。" +
                "JK还能帮助你解决很多Android开发中遇到的方方面面的问题，如运行时权限申请、控件id无声明式绑定、" +
                "数据ORM存储、图形图像处理、文件读写与流的快速关闭等，详见README。"
    }
}