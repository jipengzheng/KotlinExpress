package com.zhengjipeng.kotlinexpress

/**
 * Created by zhengjipeng on 2017/6/21.
 */
interface IView<T> {
    fun setPresenter(presenter: T)
}