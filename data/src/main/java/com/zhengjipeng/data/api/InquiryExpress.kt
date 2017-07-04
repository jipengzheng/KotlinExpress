package com.zhengjipeng.data.api

import com.zhengjipeng.data.DO.OddNumber
import com.zhengjipeng.data.DO.Traces
import com.zhengjipeng.data.DataLayer
import io.reactivex.Observable
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by zhengjipeng on 2017/6/21.
 */
internal interface InquiryExpress {

    companion object {
        val IMP = DataLayer.RETROFIT_INQUIRY!!.create(InquiryExpress::class.java)!!
    }

    @FormUrlEncoded
    @POST("Ebusiness/EbusinessOrderHandle.aspx")
    fun getExpressInfo(
            @Field("RequestData") requestDate: String,
            @Field("DataSign") dataSign: String,
            @Field("RequestType") requestType: String = "2002",
            @Field("EBusinessID") eBusinessID: String = DataLayer.EBusisnessID,
            @Field("DataType") dataType: String = "2"
    ): Observable<OddNumber>

    @FormUrlEncoded
    @POST("Ebusiness/EbusinessOrderHandle.aspx")
    fun getTracesData(
            @Field("RequestData") requestDate: String,
            @Field("DataSign") dataSign: String,
            @Field("RequestType") requestType: String = "1002",
            @Field("EBusinessID") eBusinessID: String = DataLayer.EBusisnessID,
            @Field("DataType") dataType: String = "2"
    ): Observable<Traces>

}