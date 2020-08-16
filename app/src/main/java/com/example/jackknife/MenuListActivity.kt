package com.example.jackknife

import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.bean.Menu
import com.example.jackknife.databinding.ActivityMenuListBinding
import com.lwh.jackknife.BaseActivity
import kotlinx.android.synthetic.main.activity_menu_list.*
import site.doramusic.app.util.open

@Route(path = ARouterPath.ACTIVITY_MENU_LIST)
class MenuListActivity : BaseActivity<ActivityMenuListBinding>() {

    private val menus : MutableList<Menu> by lazy {
        val items = ArrayList<Menu>()
        items.add(Menu(0, "简介",             ARouterPath.ACTIVITY_INTRODUCE))
        items.add(Menu(1, "运行时权限申请",    ARouterPath.ACTIVITY_REQUEST_PERMISSION))
        items.add(Menu(2, "多通道崩溃信息收集", ARouterPath.ACTIVITY_BUGS_KILLER))
        items
    }

    override fun getLayoutId(): Int {
        return R.layout.activity_menu_list
    }

    override fun initData(savedInstanceState: Bundle?) {
        rv_menu_list.layoutManager = LinearLayoutManager(this)
        rv_menu_list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        val adapter = MenuListAdapter(menus)
        adapter.setOnItemClickListener { _, _, data, position ->
            data as Menu
            when (position) {
                data.id.toInt() -> {
                    open(data.path)
                }
            }
        }
        rv_menu_list.adapter = adapter
    }
}