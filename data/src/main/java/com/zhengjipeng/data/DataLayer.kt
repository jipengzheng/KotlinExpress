package com.zhengjipeng.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.Cache
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

/**
 * Created by zhengjipeng on 2017/6/21.
 */
object DataLayer {
    const val EBusisnessID = "1292776"
    const val AppKey = "a7856a06-555d-490f-9eef-b267a4ab625d"

    const val BaseURL = "http://api.kdniao.cc/"

    var CONTEXT: Context? = null
    var RETROFIT_INQUIRY: Retrofit? = null
    var CLIENT: OkHttpClient? = null
    var GSON: Gson? = null

    fun init(context: Context): Unit {
        DataLayer.CONTEXT = context.applicationContext

        CLIENT = OkHttpClient.Builder()
                .cache(Cache(File(context.cacheDir, "okhttp"), 10 * 1024 * 1024L))
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .build()

        GSON = GsonBuilder().setDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss'.'SSS'Z'").create()

        RETROFIT_INQUIRY = Retrofit.Builder()
                .baseUrl(BaseURL)
                .addConverterFactory(GsonConverterFactory.create(GSON))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(CLIENT)
                .build()
    }
}