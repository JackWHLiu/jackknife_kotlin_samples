package com.example.jackknife.ui

import android.content.Intent
import android.os.Bundle
import android.view.KeyEvent
import android.view.ViewGroup
import android.widget.LinearLayout
import com.alibaba.android.arouter.facade.annotation.Route
import com.example.jackknife.ARouterPath
import com.example.jackknife.R
import com.example.jackknife.databinding.ActivityWebViewBinding
import com.just.agentweb.AgentWeb
import com.lwh.jackknife.BaseActivity
import com.lwh.jackknife.util.IntentUtils
import kotlinx.android.synthetic.main.activity_web_view.*

@Route(path = ARouterPath.ACTIVITY_WEB_VIEW)
class WebViewActivity : BaseActivity<ActivityWebViewBinding>() {

    lateinit var agentWeb: AgentWeb
    var url = "https://github.com/JackWHLiu/jackknife"

    override fun getLayoutId(): Int {
        return R.layout.activity_web_view
    }

    override fun onGetExtras(bundle: Bundle?, intent: Intent) {
        if (IntentUtils.hasExtra(intent, "url")) {
            url = IntentUtils.getStringExtra(intent, "url")
        }
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
            .go(url)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return agentWeb.handleKeyEvent(keyCode, event)
    }

    override fun onDestroy() {
        super.onDestroy()
        agentWeb.destroy()
    }
}