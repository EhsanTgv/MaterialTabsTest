package com.taghavi.materialtabstest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ViewPagerAdapter(private val context: Context) :
    RecyclerView.Adapter<ViewPagerAdapter.PagerVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerVH =
        PagerVH(
            LayoutInflater.from(context)
                .inflate(R.layout.item_view_pager, parent, false)
        )

    override fun getItemCount(): Int = 2

    override fun onBindViewHolder(holder: PagerVH, position: Int) {
        when (position) {
            0 -> {
                holder.itemView.setBackgroundResource(R.color.teal_200)
            }
            1 -> {
                holder.itemView.setBackgroundResource(R.color.purple_200)
            }
        }
    }

    class PagerVH(itemView: View) : RecyclerView.ViewHolder(itemView)
}