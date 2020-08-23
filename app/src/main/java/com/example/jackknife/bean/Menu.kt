package com.example.jackknife.bean

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class Menu(var id: Int, var title: String, var path: String) : BaseObservable() {

//    /**
//     * [android.widget.TextView.setText] )}时，如果给这个id，会找不到值，报错，因为这个id不是资
//     * 源id。
//     *
//     * @return
//     */
//    @Bindable
//    fun getId(): String {
//        return id.toString()
//    }

    /**
     * 兼容CircleCI的docker镜像的编译。
     *
     * @return
     */
    @Bindable
    fun getIdToString(): String {
        return id.toString()
    }
}