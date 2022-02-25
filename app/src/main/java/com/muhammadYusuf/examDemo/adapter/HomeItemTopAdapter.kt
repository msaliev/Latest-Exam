package com.muhammadYusuf.examDemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadYusuf.examDemo.databinding.LayoutHomeItemTopBinding

class HomeItemTopAdapter(
)
    : RecyclerView.Adapter<HomeItemTopAdapter.ClinicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClinicViewHolder {
        val binding=
            LayoutHomeItemTopBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClinicViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ClinicViewHolder, position: Int) {
    }

    override fun getItemCount()=30

    inner class ClinicViewHolder(private val itemBinding: LayoutHomeItemTopBinding)
        : RecyclerView.ViewHolder(itemBinding.root){



    }

}