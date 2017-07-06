package com.zhengjipeng.kotlinexpress.send

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import android.view.MenuItem
import com.zhengjipeng.kotlinexpress.BaseActivity

import com.zhengjipeng.kotlinexpress.R
import com.zhengjipeng.kotlinexpress.main.Contract
import android.webkit.WebView
import android.webkit.WebViewClient



class SendEmailActivity : BaseActivity() {

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home){
            finish()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_email)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        toolbar.title = ""
        setSupportActionBar(toolbar)
        val webView = findViewById(R.id.webView) as WebView
        //WebView加载web资源
        webView.loadUrl("http://wap.guoguo-app.com/cpCompany.htm?type=10")
        //覆盖WebView默认使用第三方或系统默认浏览器打开网页的行为，使网页用WebView打开
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true
        webSettings.loadWithOverviewMode = true
        webSettings.useWideViewPort = true
        webSettings.javaScriptCanOpenWindowsAutomatically = true
        webView.setWebViewClient(object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
                //返回值是true的时候控制去WebView打开，为false调用系统浏览器或第三方浏览器
                if (url.startsWith("tel:")) {
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse(url))
                    startActivity(intent)
                    return true
                }
                view.loadUrl(url)
                return true
            }
        })
    }
}
