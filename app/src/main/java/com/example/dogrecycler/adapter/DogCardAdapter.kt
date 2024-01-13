package com.example.dogrecycler.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dogrecycler.Const.Layout
import com.example.dogrecycler.R
import com.example.dogrecycler.data.DataSource

class DogCardAdapter(
    private val context: Context?,
    private val layout:Int

    ):RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>(){
    class DogCardViewHolder(view: View?):RecyclerView.ViewHolder(view!!) {

        val imageView:ImageView=view!!.findViewById(R.id.dogImage)
        val dogName:TextView=view!!.findViewById(R.id.dogName)
        val dogAge:TextView=view!!.findViewById(R.id.dog_age)
        val dogHob:TextView=view!!.findViewById(R.id.hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        if(layout==Layout.GRID){
            val adapterLayout= LayoutInflater.from(parent.context).inflate(R.layout.grid_list_item,parent,false)
            return DogCardViewHolder(adapterLayout)
        }
        else if(layout==Layout.HORIZONTAL || layout==Layout.VERTICAL){
            val adapterLayout= LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_list_item,parent,false)
            return DogCardViewHolder(adapterLayout)
        }

        return TODO("Provide the return value")
    }

    override fun getItemCount(): Int=DataSource.dogs.size

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val item=DataSource.dogs.get(position)
        holder.imageView.setImageResource(item.imageResourceId)
        //.setImageResource(item.imageResourceId)
        holder.dogName.text="Name: ${item.name}"
        holder.dogAge.text="Age:   ${item.age}"
        holder.dogHob.text="Hobby: ${item.hobbies}"

    }
    }
