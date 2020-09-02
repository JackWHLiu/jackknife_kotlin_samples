package com.example.jackknife

import android.view.View
import com.example.jackknife.bean.Menu
import com.example.jackknife.databinding.ItemMenuListBinding
import com.lwh.jackknife.adapter.JKAdapter
import com.lwh.jackknife.adapter.JKViewHolder

class MenuListAdapter(menus: MutableList<Menu>) : JKAdapter<Menu, ItemMenuListBinding>(menus) {

    override fun getLayoutId(viewType: Int): Int {
        return R.layout.item_menu_list
    }

    class MenuListViewHolder(itemView: View?) : JKViewHolder<Menu, ItemMenuListBinding>(itemView) {

        override fun setData(binding: ItemMenuListBinding, data: Menu, position: Int) {
            //固定写法，先这样吧，以后考虑自动赋值
            binding.menu = data
            binding.tvMenuItemId.text = (position + 1).toString()
        }
    }

    override fun getHolder(v: View, viewType: Int): JKViewHolder<Menu, ItemMenuListBinding> {
        return MenuListViewHolder(v)
    }
}