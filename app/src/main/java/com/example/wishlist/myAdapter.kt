package com.example.wishlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class myAdapter(private val items: List<data>): RecyclerView.Adapter<myAdapter.ViewHolder>() {

   class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

       val leftTextView: TextView
        val RightTopTextView: TextView
        val RightBottomTextView: TextView

        init {
            leftTextView = itemView.findViewById(R.id.leftTextView)
            RightTopTextView = itemView.findViewById(R.id.RightTopTextView)
            RightBottomTextView = itemView.findViewById(R.id.RightBottomTextView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.secondxml, parent, false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
       return items.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = items.get(position)
        holder.leftTextView.text = items.title
        holder.RightTopTextView.text = items.Righttoptitle
        holder.RightBottomTextView.text = items.Rightbottomtitle

    }
}


