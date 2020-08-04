package com.example.jackknife

import android.view.View
import android.widget.TextView
import com.lwh.jackknife.adapter.JKAdapter
import com.lwh.jackknife.adapter.JKViewHolder

class MenuListAdapter(infos: MutableList<String>) : JKAdapter<String>(infos) {

    override fun getLayoutId(viewType: Int): Int {
        return android.R.layout.simple_list_item_1
    }

    class MenuListViewHolder(itemView: View?) : JKViewHolder<String>(itemView) {

        override fun setData(data: String, position: Int) {
            val tv = itemView.findViewById<TextView>(android.R.id.text1)
            tv.text = data
        }
    }

    override fun getHolder(v: View, viewType: Int): JKViewHolder<String> {
        return MenuListViewHolder(v)
    }
}