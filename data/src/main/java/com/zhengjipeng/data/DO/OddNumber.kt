package com.zhengjipeng.data.DO

import com.google.gson.annotations.SerializedName

/**
 * Created by zhengjipeng on 2017/6/21.
 */
data class OddNumber(
        @SerializedName("EBusinessID") override var id: String,
        @SerializedName("LogisticCode") var logisticCode: String,
        @SerializedName("Success") var success: Boolean,
        @SerializedName("Code") var code: Int,
        @SerializedName("Shippers") var shipper: List<Shipper>
): EBusinessID{

}