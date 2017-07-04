package com.zhengjipeng.data.DO

import com.google.gson.annotations.SerializedName

/**
 * Created by zhengjipeng on 2017/6/22.
 */
data class Traces(
        @SerializedName("EBusinessID") override var id: String,
        @SerializedName("OrderCode") var orderCode: String,
        @SerializedName("ShipperCode") var shipperCode: String,
        @SerializedName("LogisticCode") var logisticCode: String,
        @SerializedName("Success") var success: Boolean,
        @SerializedName("CallBack") var callBack: String,
        @SerializedName("State") var state: String,
        @SerializedName("Reason") var reason: String,
        @SerializedName("Traces") var traces: List<Trace>
): EBusinessID