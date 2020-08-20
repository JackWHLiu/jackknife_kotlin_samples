package com.example.jackknife.bean

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable

data class Menu(var id: Int, var title: String, var path: String) : BaseObservable() {

    /**
     * [android.widget.TextView.setText] )}时，如果给这个id，会招不到值，报错，因为这个id不是资
     * 源id。
     *
     * @return
     */
    @Bindable
    fun getId(): String {
        return id.toString()
    }
}