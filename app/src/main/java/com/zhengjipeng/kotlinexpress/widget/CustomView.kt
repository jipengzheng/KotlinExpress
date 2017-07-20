package com.zhengjipeng.kotlinexpress.widget

import android.support.constraint.ConstraintLayout
import android.text.Editable
import android.text.TextWatcher
import android.view.ViewManager
import org.jetbrains.anko.custom.ankoView

/**
 * Created by zhengjipeng on 2017/6/22.
 */


//ConstraintLayout的扩展
inline fun ViewManager.constraintLayout() = constraintLayout() {}
inline fun ViewManager.constraintLayout(theme: Int = 0, init: ConstraintLayout.() -> Unit) = ankoView({ ConstraintLayout(it) }, theme, init)
