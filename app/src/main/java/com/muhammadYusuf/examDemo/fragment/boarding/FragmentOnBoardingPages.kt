package com.muhammadYusuf.examDemo.fragment.boarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.muhammadYusuf.examDemo.model.BoardingModel
import com.muhammadYusuf.examDemo.common.Common
import com.muhammadYusuf.examDemo.databinding.FragmentOnboardingItemBinding

class FragmentOnBoardingPages:Fragment() {
    private lateinit var binding: FragmentOnboardingItemBinding
    private lateinit var questionNumber: BoardingModel
    var questionIndex = -1
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentOnboardingItemBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        questionIndex = requireArguments().getInt("index", -1)
        questionNumber = Common.questionNumbers[questionIndex]

        binding.apply {
            imageView.setImageResource(questionNumber.image)
            middleDescription.text=questionNumber.topDescription
            middleTitle.text=questionNumber.topTitle
        }


    }
}