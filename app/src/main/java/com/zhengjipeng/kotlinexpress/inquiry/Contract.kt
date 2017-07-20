package com.zhengjipeng.kotlinexpress.inquiry

import com.zhengjipeng.data.DO.Shipper
import com.zhengjipeng.kotlinexpress.base.IPresenter
import com.zhengjipeng.kotlinexpress.base.IView

/**
 * Created by zhengjipeng on 2017/6/21.
 */
interface Contract {

    interface Presenter: IPresenter {
        fun getExpressName(number: String)
    }

    interface View: IView {
        fun refreshList(showList: Boolean)
        fun setAdapter(shippers: ArrayList<Shipper>)
    }
}