package com.zhengjipeng.kotlinexpress.inquiry

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.BaseAdapter
import com.zhengjipeng.data.DO.Shipper
import com.zhengjipeng.kotlinexpress.base.BaseActivity


import com.zhengjipeng.kotlinexpress.R
import kotlinx.android.synthetic.main.activity_inquiry.*
import org.jetbrains.anko.textChangedListener

class InquiryActivity : BaseActivity(), Contract.View {

    override fun setAdapter(shippers: ArrayList<Shipper>) {
        lv_shipper.adapter = ShipperAdapter(shippers, this)
    }


    override fun refreshList(showList: Boolean) {
        if (showList) {
            lv_shipper.visibility = View.VISIBLE
            val adapter = lv_shipper.adapter as? BaseAdapter
            adapter?.notifyDataSetChanged()
        } else {
            lv_shipper.visibility = View.GONE
        }
    }

    var presenter: Contract.Presenter? = null

    override fun onCreatePresenter(presenterFactory: PresenterFactory) {
        presenter = presenterFactory.createOrGet(InquiryPresenter::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inquiry)
        toolbar.title = ""
        setSupportActionBar(toolbar)
        et_number.textChangedListener {
            onTextChanged { charSequence, start, before, count ->
                presenter?.getExpressName(charSequence.toString())
            }
        }
        lv_shipper.addFooterView(LayoutInflater.from(this).inflate(R.layout.item_inquiry_foot, null))
    }
}
