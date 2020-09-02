package com.example.jackknife

import android.graphics.Color
import android.os.Bundle
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.databinding.ActivityBitmapBinding
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.util.ImageUtils
import kotlinx.android.synthetic.main.activity_bitmap.*

@Route(path = ARouterPath.ACTIVITY_BITMAP)
class BitmapActivity : BaseActivity<ActivityBitmapBinding>() {

    override fun getLayoutId(): Int {
        return R.layout.activity_bitmap
    }

    override fun initData(savedInstanceState: Bundle?) {
        //倒影
        btn_bitmap_01.setOnClickListener {
            val dst = ImageUtils.createBitmap(resources.getDrawable(R.mipmap.dora_logo))
            iv_bitmap_display.setImageBitmap(ImageUtils.makeReflectionBitmap(dst))
        }
        //黑白
        btn_bitmap_02.setOnClickListener {
            val dst = ImageUtils.createBitmap(resources.getDrawable(R.mipmap.dora_logo))
            iv_bitmap_display.setImageBitmap(ImageUtils.makeBlackBitmap(dst))
        }
        //裁剪成圆形
        btn_bitmap_03.setOnClickListener {
            val dst = ImageUtils.createBitmap(resources.getDrawable(R.mipmap.dora_logo))
            iv_bitmap_display.setImageBitmap(ImageUtils.makeRoundBitmap(dst))
        }
        //裁剪成圆角矩形
        btn_bitmap_04.setOnClickListener {
            val dst = ImageUtils.createBitmap(resources.getDrawable(R.mipmap.dora_logo))
            iv_bitmap_display.setImageBitmap(ImageUtils.makeRoundCornerBitmap(dst, 20, Color.WHITE))
        }
    }
}