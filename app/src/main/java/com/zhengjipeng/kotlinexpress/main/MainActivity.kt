package com.zhengjipeng.kotlinexpress.main

import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.Menu
import com.zhengjipeng.kotlinexpress.base.BaseActivity
import com.zhengjipeng.kotlinexpress.R
import com.zhengjipeng.kotlinexpress.UIRouter


class MainActivity : BaseActivity(), Contract.View {
    override fun onCreatePresenter(presenterFactory: PresenterFactory) {
        presenterFactory.createOrGet(MainPresenter::class.java)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val toolbar = findViewById(R.id.toolbar) as Toolbar
        toolbar.title = ""
        setSupportActionBar(toolbar)

        toolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_about -> true
                R.id.action_author -> true
                R.id.action_theme -> true
                else -> false
            }
        }

        val search = findViewById(R.id.layout_search)
        search.setOnClickListener {
            UIRouter.IMP.gotoInquiry(this)
        }
        val post = findViewById(R.id.layout_post)
        post.setOnClickListener {
            UIRouter.IMP.gotoSendEmail(this)
        }
        val sweep = findViewById(R.id.layout_sweep)
        sweep.setOnClickListener {
            UIRouter.IMP.gotoORCode(this)
        }

        /*InquiryService.getExpressName("810669516442")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    InquiryService.getTracesData(it.logisticCode, it.shipper[0].shippercode)
                            .subscribeOn(Schedulers.io())
                            .observeOn(AndroidSchedulers.mainThread())
                            .subscribe {
                                Log.d("zjp", it.toString())
                            }
                }*/
    }

}


