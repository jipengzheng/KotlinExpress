package com.zhengjipeng.kotlinexpress.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.zhengjipeng.kotlinexpress.R

/**
 * Created by zhengjipeng on 2017/7/20.
 */
object ImageUtils {

    fun showImage(context: Context, uri: String, imageView: ImageView, errorId: Int = R.drawable.ic_logo_default) {
        Glide.with(context).applyDefaultRequestOptions(RequestOptions.errorOf(errorId)).load(uri).into(imageView)
    }

}