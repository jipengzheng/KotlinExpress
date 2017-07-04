package com.zhengjipeng.kotlinexpress

import android.app.Application
import com.zhengjipeng.data.DataLayer

/**
 * Created by zhengjipeng on 2017/6/21.
 */
class App: Application() {
    override fun onCreate() {
        super.onCreate()
        DataLayer.init(this)
    }
}