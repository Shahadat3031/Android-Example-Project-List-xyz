package com.sheba.simplerecyclerviewwithkotlin.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sheba.simplerecyclerviewwithkotlin.R
import com.sheba.simplerecyclerviewwithkotlin.model.User


class SimpleCustomAdapter(val userItemList:ArrayList<User>) : RecyclerView.Adapter<SimpleCustomAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_row_item, parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int {
        return userItemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val user : User = userItemList[position]

        holder?.name.setText(user.name)
        holder?.address.setText(user.address)


    }

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById(R.id.name) as TextView
        val address = itemView.findViewById(R.id.address) as TextView
    }

}
