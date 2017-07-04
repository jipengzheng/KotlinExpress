package com.zhengjipeng.kotlinexpress.send

import com.zhengjipeng.kotlinexpress.IPresenter
import com.zhengjipeng.kotlinexpress.IView

/**
 * Created by zhengjipeng on 2017/6/27.
 */
interface Contract {

    interface Presenter: IPresenter {

    }

    interface View: IView<Presenter> {

    }
}