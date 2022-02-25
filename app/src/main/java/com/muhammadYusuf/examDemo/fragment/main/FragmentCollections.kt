package com.muhammadYusuf.examDemo.fragment.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadYusuf.examDemo.R
import com.muhammadYusuf.examDemo.adapter.AdapterCategory
import com.muhammadYusuf.examDemo.adapter.HomeBottomAdapter
import com.muhammadYusuf.examDemo.adapter.HomeItemTopAdapter
import com.muhammadYusuf.examDemo.databinding.FragmentCollectionsBinding
import com.muhammadYusuf.examDemo.databinding.FragmentHomeBinding

class FragmentCollections : Fragment() {

    private var _binding: FragmentCollectionsBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentCollectionsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding=null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            recyclerView.apply {
                layoutManager= LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                adapter= AdapterCategory()
            }

        }

    }
}