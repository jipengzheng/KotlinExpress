package com.zhengjipeng.kotlinexpress.base

import org.jetbrains.anko.toast

/**
 * Created by zhengjipeng on 2017/6/21.
 */
interface IView : IContextProvider {
    fun toast(msg: String) {
        getContext()?.toast(msg)
    }
}