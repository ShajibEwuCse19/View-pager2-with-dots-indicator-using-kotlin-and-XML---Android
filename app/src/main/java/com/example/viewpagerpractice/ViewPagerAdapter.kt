package com.example.viewpagerpractice

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * @author Shajib
 * @since Jul 08, 2024
 **/

//step-2: create viewPager adapter
class ViewPagerAdapter: RecyclerView.Adapter<MyViewHolder>() {
    //step-4: create list
    private val itemList = listOf(
        "The golden rays of the setting sun painted the sky in hues of orange and pink, casting a magical glow over the tranquil sea.",
        "In the stillness of the forest, the gentle rustle of leaves whispered secrets to the wandering breeze, creating a symphony of nature's serenity.",
        "Under the silver moonlight, the world transformed into a realm of dreams, where every shadow held a story waiting to be told."
    )

    //step-5: Implement Members
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.page_layout,parent,false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int {
        val totalItem = itemList.count()
        return totalItem
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }
}

//step-3: create viewHolder
class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    private val pagerText: TextView = itemView.findViewById(R.id.textView)
    fun bind(item: String) {
        pagerText.text = item
    }
}