package com.muhammadYusuf.examDemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadYusuf.examDemo.databinding.LayoutHomeItemTopBinding
import com.muhammadYusuf.examDemo.databinding.LayoutHomeSubitemBinding

class AdapterHomeSubItem(
)
    : RecyclerView.Adapter<AdapterHomeSubItem.ClinicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClinicViewHolder {
        val binding=
            LayoutHomeSubitemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClinicViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ClinicViewHolder, position: Int) {
    }

    override fun getItemCount()=30

    inner class ClinicViewHolder(private val itemBinding: LayoutHomeSubitemBinding)
        : RecyclerView.ViewHolder(itemBinding.root){



    }

}