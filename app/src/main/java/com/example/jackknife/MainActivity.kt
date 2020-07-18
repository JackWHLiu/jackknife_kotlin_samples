package com.example.jackknife

import android.os.Bundle
import com.example.jackknife.databinding.ActivityMainBinding
import com.lwh.jackknife.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun initData(savedInstanceState: Bundle?) {
        tv_hello_world.text = "Hello, JackKnife MvvM!"  //无需声明控件，直接使用
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_main
    }
}