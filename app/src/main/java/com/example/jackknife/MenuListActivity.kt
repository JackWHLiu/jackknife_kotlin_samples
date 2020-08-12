package com.example.jackknife

import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.databinding.ActivityMenuListBinding
import com.lwh.jackknife.BaseActivity
import kotlinx.android.synthetic.main.activity_menu_list.*
import site.doramusic.app.util.open

@Route(path = ARouterPath.ACTIVITY_MENU_LIST)
class MenuListActivity : BaseActivity<ActivityMenuListBinding>() {

    val menus : MutableList<String> by lazy {
        var items = ArrayList<String>()
        items.add("简介")
        items.add("运行时权限申请")
        items.add("多通道崩溃信息收集")
        items
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_menu_list
    }

    override fun initData(savedInstanceState: Bundle?) {
        rv_menu_list.layoutManager = LinearLayoutManager(this)
        rv_menu_list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        val adapter = MenuListAdapter(menus)
        adapter.setOnItemClickListener { view, viewType, data, position ->
            when (position) {
                0 -> open(ARouterPath.ACTIVITY_INTRODUCE)
                1 -> open(ARouterPath.ACTIVITY_REQUEST_PERMISSION)
                2 -> open(ARouterPath.ACTIVITY_BUGS_KILLER)
            }
        }
        rv_menu_list.adapter = adapter
    }
}