package com.zhengjipeng.data.DO

import com.google.gson.annotations.SerializedName

/**
 * Created by zhengjipeng on 2017/6/22.
 */
data class Trace(
        @SerializedName("AcceptTime") var acceptTime: String,
        @SerializedName("AcceptStation") var acceptStation: String,
        @SerializedName("Remark") var remark: String
)