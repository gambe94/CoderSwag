package com.example.demet.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.demet.coderswag.Model.Category
import com.example.demet.coderswag.R
import kotlinx.android.synthetic.main.category_list_item.view.*

/**
 * Created by demet on 2018. 01. 23..
 */
class CategoryRecycleAdapter(val context:Context, val categories: List<Category>): RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {
    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder?, position: Int) {
        holder?.bindCategory(categories[position], context)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {
        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.category_list_item, parent, false)
        return Holder(view)
    }


    inner class Holder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)

        fun bindCategory(category: Category, context: Context){
            val resourceId = context.resources.getIdentifier(category.Image, "drawable", context.packageName)
            categoryImage?.setImageResource(resourceId)
            categoryName?.text = category.title

        }
    }
}