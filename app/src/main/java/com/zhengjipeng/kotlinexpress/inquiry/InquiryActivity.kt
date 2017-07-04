package com.zhengjipeng.kotlinexpress.inquiry

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.zhengjipeng.kotlinexpress.R

class InquiryActivity : AppCompatActivity(), Contract.View {
    override fun setPresenter(presenter: Contract.Presenter) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inquiry)
    }
}
