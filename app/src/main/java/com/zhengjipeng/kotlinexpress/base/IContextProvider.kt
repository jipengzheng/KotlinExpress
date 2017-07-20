package com.zhengjipeng.kotlinexpress.base

import android.content.Context

/**
 * Created by zhengjipeng on 2017/7/18.
 */
interface IContextProvider {
    fun getContext(): Context?
}