package com.muhammadYusuf.examDemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.muhammadYusuf.examDemo.databinding.LayoutCollectionItemBinding

class AdapterCategory(
)
    : RecyclerView.Adapter<AdapterCategory.ClinicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ClinicViewHolder {
        val binding=
            LayoutCollectionItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ClinicViewHolder(binding)
    }


    override fun onBindViewHolder(holder: ClinicViewHolder, position: Int) {
    }

    override fun getItemCount()=30

    inner class ClinicViewHolder(private val itemBinding: LayoutCollectionItemBinding)
        : RecyclerView.ViewHolder(itemBinding.root){



    }

}