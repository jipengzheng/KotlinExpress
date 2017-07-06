package com.zhengjipeng.kotlinexpress.inquiry

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.zhengjipeng.kotlinexpress.BaseActivity

import com.zhengjipeng.kotlinexpress.R
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar

class InquiryActivity : BaseActivity(), Contract.View {


    override fun setPresenter(presenter: Contract.Presenter) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inquiry)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        toolbar.title = ""
        setSupportActionBar(toolbar)
        /*setContentView(this.UI {
            verticalLayout {
                lparams {
                    width = org.jetbrains.anko.matchParent
                    height = org.jetbrains.anko.matchParent
                }
                backgroundColor = 0xFF00BFFF.toInt()

                val toolbar = toolbar {
                   lparams {
                       height = dip(50)
                       width = org.jetbrains.anko.matchParent
                   }
                    textView {
                        text = "111111"
                        textColor = android.graphics.Color.WHITE
                    }.lparams {
                        gravity = android.view.Gravity.CENTER
                    }
                    title = ""

                }
                setSupportActionBar(toolbar)
                toolbar.setOnMenuItemClickListener { it ->
                    when (it.itemId) {
                        R.id.action_theme -> true
                        R.id.action_author -> true
                        R.id.action_about -> true
                        else -> true
                    }
                }

                linearLayout {
                    lparams {
                        width = org.jetbrains.anko.matchParent
                        height = dip(240)
                    }

                    frameLayout {

                    }.lparams {
                        weight = 1.0f
                    }

                }
            }
        }.view)*/
    }
}
