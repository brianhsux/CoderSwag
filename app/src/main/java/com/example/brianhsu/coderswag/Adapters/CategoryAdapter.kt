package com.example.brianhsu.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.brianhsu.coderswag.Model.Category
import com.example.brianhsu.coderswag.R

/**
 * Created by brian on 2018/3/16.
 */
class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {

    val mContext = context
    val mCategories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(mContext).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()
            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)
            println("I exixt for the first time!")
            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
            println("Go green recycle~")
        }

        val category = mCategories[position]
        val resourceId = mContext.resources.getIdentifier(category.image, "drawable", mContext.packageName)
        holder.categoryName?.text = category.title
        holder.categoryImage?.setImageResource(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return mCategories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return mCategories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}