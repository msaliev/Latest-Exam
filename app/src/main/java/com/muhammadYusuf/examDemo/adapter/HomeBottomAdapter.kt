package com.muhammadYusuf.examDemo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.muhammadYusuf.examDemo.databinding.LayoutHomeItemBottomBinding
import com.muhammadYusuf.examDemo.databinding.LayoutHomeItemTopBinding

class HomeBottomAdapter(private val context:Context
)
    : RecyclerView.Adapter<HomeBottomAdapter.ClinicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClinicViewHolder {
        val binding=
            LayoutHomeItemBottomBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClinicViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ClinicViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount()=10

    inner class ClinicViewHolder(private val itemBinding: LayoutHomeItemBottomBinding)
        : RecyclerView.ViewHolder(itemBinding.root){


            fun bind(){
                itemBinding.recyclerView2.layoutManager=LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                itemBinding.recyclerView2.adapter=AdapterHomeSubItem()
            }

    }

}