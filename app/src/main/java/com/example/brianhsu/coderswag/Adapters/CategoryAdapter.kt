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
        val categoryView = LayoutInflater.from(mContext).inflate(R.layout.category_list_item, null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        val category = mCategories[position]
        val resourceId = mContext.resources.getIdentifier(category.image, "drawable", mContext.packageName)

        categoryName.text = category.title
        categoryImage.setImageResource(resourceId)
        println(resourceId)

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
}