package com.zhengjipeng.data.service

import com.zhengjipeng.data.DO.OddNumber
import com.zhengjipeng.data.DO.Traces
import com.zhengjipeng.data.DataLayer
import com.zhengjipeng.data.api.InquiryExpress
import com.zhengjipeng.data.utils.TranscodeUtils
import io.reactivex.Observable
import org.json.JSONObject

/**
 * Created by zhengjipeng on 2017/6/21.
 */
object InquiryService {

    /**
     * 根据单号获取快递公司名称
     */
    fun getExpressName(oddNumber: String): Observable<OddNumber> {
        var jsonObject = JSONObject()
        jsonObject.put("LogisticCode", oddNumber)
        var requestData = jsonObject.toString()
        var dataSign = TranscodeUtils.encrypt(requestData, DataLayer.AppKey, "UTF-8")
        return InquiryExpress.IMP.getExpressInfo(requestData, dataSign)
    }

    /**
     * 根据快递公司编码和物流单号获取物流轨迹
     */
    fun getTracesData(oddNumber: String, shipperCode: String): Observable<Traces> {
        var jsonObject = JSONObject()
        jsonObject.put("ShipperCode", shipperCode)
        jsonObject.put("LogisticCode", oddNumber)
        var requestData = jsonObject.toString()
        var dataSign = TranscodeUtils.encrypt(requestData, DataLayer.AppKey, "UTF-8")
        return InquiryExpress.IMP.getTracesData(requestData, dataSign)
    }

}