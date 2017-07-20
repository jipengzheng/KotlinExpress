package com.zhengjipeng.kotlinexpress.base

import com.zhengjipeng.kotlinexpress.UIRouter
import org.jetbrains.anko.toast

/**
 * Created by zhengjipeng on 2017/6/21.
 */
interface IPresenter: UIRouter, IContextProvider {
    fun onError(err: Throwable) {
        getContext()?.toast(err.message ?:"Unknow Error")
    }
}