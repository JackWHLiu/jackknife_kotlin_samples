package com.example.jackknife.ui

import android.os.Bundle
import android.os.Environment
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.ARouterPath
import com.example.jackknife.R
import com.example.jackknife.databinding.ActivityTestBinding
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.av.util.VideoUtils

@Route(path = ARouterPath.ACTIVITY_TEST)
class TestActivity : BaseActivity<ActivityTestBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_test
    }

    override fun initData(savedInstanceState: Bundle?) {
        val sdRoot = Environment.getExternalStorageDirectory().absolutePath
        //给视频添加背景音乐
        VideoUtils.addVideoBGM(
            sdRoot + "/input.mp4",
            sdRoot + "/input.mp3",
            sdRoot + "/output.mp4"
        )
    }
}