package com.example.jackknife

import android.os.Bundle
import android.view.KeyEvent
import android.view.ViewGroup
import android.widget.LinearLayout
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.databinding.ActivityWebViewBinding
import com.just.agentweb.AgentWeb
import com.lwh.jackknife.BaseActivity
import kotlinx.android.synthetic.main.activity_web_view.*

@Route(path = ARouterPath.ACTIVITY_WEB_VIEW)
class WebViewActivity : BaseActivity<ActivityWebViewBinding>() {

    lateinit var agentWeb: AgentWeb

    override fun getLayoutId(): Int {
        return R.layout.activity_web_view
    }

    override fun initData(savedInstanceState: Bundle?) {
        agentWeb = AgentWeb.with(this)
            .setAgentWebParent(rl_web_page,
                LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                    ViewGroup.LayoutParams.MATCH_PARENT)
            )
            .useDefaultIndicator()
            .createAgentWeb()
            .ready()
            .go("https://github.com/JackWHLiu/jackknife")
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return agentWeb.handleKeyEvent(keyCode, event)
    }

    override fun onDestroy() {
        super.onDestroy()
        agentWeb.destroy()
    }
}