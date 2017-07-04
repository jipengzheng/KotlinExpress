package com.zhengjipeng.data.DO

import com.google.gson.annotations.SerializedName

/**
 * Created by zhengjipeng on 2017/6/21.
 */
data class Shipper(
        @SerializedName("ShipperCode") var shippercode: String,//快递公司编码
        @SerializedName("ShipperName") var shipperName: String//快递公司名称
) {
}