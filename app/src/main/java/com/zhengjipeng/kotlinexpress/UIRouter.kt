package com.zhengjipeng.kotlinexpress

import android.content.Context
import cn.nekocode.meepo.Meepo
import cn.nekocode.meepo.annotation.TargetClass
import com.journeyapps.barcodescanner.CaptureActivity
import com.zhengjipeng.kotlinexpress.inquiry.InquiryActivity
import com.zhengjipeng.kotlinexpress.send.SendEmailActivity

/**
 * Created by zhengjipeng on 2017/6/21.
 */
interface UIRouter {
    companion object {
        val IMP = Meepo.Builder().build().create(UIRouter::class.java)
    }

    @TargetClass(InquiryActivity::class)
    fun gotoInquiry(context: Context?){
        IMP.gotoInquiry(context)
    }

    @TargetClass(SendEmailActivity::class)
    fun gotoSendEmail(context: Context?) {
        IMP.gotoSendEmail(context)
    }

    @TargetClass(CaptureActivity::class)
    fun gotoORCode(context: Context?) {
        IMP.gotoORCode(context)
    }
}