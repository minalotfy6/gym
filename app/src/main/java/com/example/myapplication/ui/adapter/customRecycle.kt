package com.example.myapplication.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.User

class customRecycle(var mylist:ArrayList<User>):RecyclerView.Adapter<customRecycle.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return mylist.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        var infoholder = mylist[position]
        holder.vname.text = infoholder.name
        holder.vprice.text = infoholder.price
        holder.supphoto.setImageResource(infoholder.imageId)

    }

    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        val vname = itemView.findViewById(R.id.ad_name) as TextView
        val vprice = itemView.findViewById(R.id.ad_price) as TextView
        val supphoto = itemView.findViewById(R.id.img_view) as ImageView

    }
}