package com.muhammadYusuf.examDemo.fragment.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.muhammadYusuf.examDemo.adapter.HomeBottomAdapter
import com.muhammadYusuf.examDemo.adapter.HomeItemTopAdapter
import com.muhammadYusuf.examDemo.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {

    private var _binding: FragmentHomeBinding?=null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding= FragmentHomeBinding.inflate(inflater, container, false)

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
                layoutManager=LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter= HomeItemTopAdapter()
            }
            recyclerView2.apply {
                layoutManager=LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
                adapter= HomeBottomAdapter(requireContext())
            }
        }

    }


}