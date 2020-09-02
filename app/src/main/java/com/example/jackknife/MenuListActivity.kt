package com.example.jackknife

import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.databinding.ActivityMenuListBinding
import com.example.jackknife.di.component.DaggerMenuComponent
import com.example.jackknife.model.MenuModel
import com.lwh.jackknife.BaseActivity
import kotlinx.android.synthetic.main.activity_menu_list.*
import javax.inject.Inject

@Route(path = ARouterPath.ACTIVITY_MENU_LIST)
class MenuListActivity : BaseActivity<ActivityMenuListBinding>() {

    @Inject
    lateinit var model: MenuModel

    override fun getLayoutId(): Int {
        return R.layout.activity_menu_list
    }

    override fun initData(savedInstanceState: Bundle?) {
        DaggerMenuComponent.builder()
            .appComponent((application as SampleApp).appComponent)
            .build()
            .inject(this)
        rv_menu_list.layoutManager = LinearLayoutManager(this)
        rv_menu_list.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        val adapter = MenuListAdapter(model.loadMenus())
        adapter.setOnItemClickListener { _, _, _, position -> open(adapter.items[position].path) }
        rv_menu_list.adapter = adapter
    }
}