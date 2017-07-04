package com.zhengjipeng.kotlinexpress.send

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

import com.zhengjipeng.kotlinexpress.R
import com.zhengjipeng.kotlinexpress.main.Contract

class SendEmailActivity : AppCompatActivity(), Contract.View {
    override fun setPresenter(presenter: Contract.Presenter) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_email)
    }
}
