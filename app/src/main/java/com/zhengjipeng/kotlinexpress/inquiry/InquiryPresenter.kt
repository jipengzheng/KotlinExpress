package com.zhengjipeng.kotlinexpress.inquiry

import android.os.Bundle
import android.util.Log
import com.zhengjipeng.data.DO.Shipper
import com.zhengjipeng.data.service.InquiryService
import com.zhengjipeng.kotlinexpress.base.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import java.util.ArrayList

/**
 * Created by zhengjipeng on 2017/6/21.
 */
class InquiryPresenter: Contract.Presenter, BasePresenter<Contract.View>() {

    lateinit var shippers: ArrayList<Shipper>

    override fun onViewCreated(view: Contract.View, savedInstanceState: Bundle?) {
        shippers = ArrayList()
        view?.setAdapter(shippers)
    }

    override fun getExpressName(number: String) {
        InquiryService.getExpressName(number)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    this.shippers.clear()
                    this.shippers.addAll(it.shipper)
                    view()?.refreshList(this.shippers.size != 0)
                }
    }
}