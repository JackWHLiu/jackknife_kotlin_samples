package com.example.jackknife.ui

import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.ARouterPath
import com.example.jackknife.R
import com.example.jackknife.databinding.ActivityBottomMenuBinding
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.util.ToastUtils
import com.lwh.jackknife.widget.popupdialog.PopupDialog
import com.lwh.jackknife.widget.popupdialog.bottom.BottomMenuDialogView

@Route(path = ARouterPath.ACTIVITY_BOTTOM_MENU)
class BottomMenuActivity : BaseActivity<ActivityBottomMenuBinding>() {

    lateinit var dialog: PopupDialog

    override fun getLayoutId(): Int {
        return R.layout.activity_bottom_menu
    }

    override fun initData(savedInstanceState: Bundle?) {
        val dialogView = BottomMenuDialogView(this, "查看用户资料", "注销登录");
        dialogView.setOnMenuClickListener { position, menu ->
            when(position) {
                0 -> ToastUtils.showShort("查看用户资料")
                1 -> ToastUtils.showLong("注销登录")
                -1 -> dialog.dismiss() //最下面的取消菜单是默认必须要添加的，position为-1，上面的菜单是从0开始排
            }
        }
        dialog = PopupDialog.Builder(this)
            .setDialogView(dialogView)    //dialog view决定菜单面板长什么样,
            .create()
        dialog.show()
    }
}