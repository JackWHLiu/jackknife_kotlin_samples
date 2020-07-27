package com.example.jackknife

import android.os.Bundle
import com.example.jackknife.databinding.ActivityMainBinding
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.util.NetworkUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initData(savedInstanceState: Bundle?) {
        tv_hello_world.text = "Hello, JackKnife MvvM!"  //无需声明控件，直接使用
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }

    //网络断开连接的回调
    override fun onNetworkDisconnected() {
    }

    //网络连接成功的回调
    override fun onNetworkConnected(type: NetworkUtils.ApnType?) {
    }
}