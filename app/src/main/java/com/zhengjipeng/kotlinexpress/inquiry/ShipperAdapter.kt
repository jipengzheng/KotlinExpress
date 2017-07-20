package com.zhengjipeng.kotlinexpress.inquiry

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.zhengjipeng.data.DO.Shipper
import com.zhengjipeng.data.service.CompanyData
import com.zhengjipeng.kotlinexpress.R
import com.zhengjipeng.kotlinexpress.utils.ImageUtils
import java.util.ArrayList

/**
 * Created by zhengjipeng on 2017/7/19.
 */
class ShipperAdapter(var shippers: ArrayList<Shipper>, val context: Context): BaseAdapter() {
    override fun getItem(position: Int) {
        shippers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return shippers.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var viewHolder: ViewHolder
        var v: View
        if (convertView == null) {
            v = View.inflate(context, R.layout.item_inquiry, null)
            viewHolder = ViewHolder(v)
            v.tag = viewHolder
        } else {
            v = convertView
            viewHolder = v.tag as ViewHolder
        }
        ImageUtils.showImage(context, CompanyData.BaseImageUrl + CompanyData.getLastName(shippers[position].shippercode), viewHolder.image)
        viewHolder.name.setText(shippers[position].shipperName)
        return v
    }

    class ViewHolder(viewItem: View) {
        var name: TextView = viewItem.findViewById(R.id.tv_name) as TextView
        var image: ImageView = viewItem.findViewById(R.id.iv_image) as ImageView
    }
}