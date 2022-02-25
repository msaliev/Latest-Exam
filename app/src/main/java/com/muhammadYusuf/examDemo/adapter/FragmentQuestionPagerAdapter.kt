package com.muhammadYusuf.examDemo.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.muhammadYusuf.examDemo.fragment.boarding.FragmentOnBoardingPages
import com.muhammadYusuf.examDemo.common.Common


class FragmentQuestionPagerAdapter(
    fm: FragmentManager,
    var context: Context,
    var fragments: List<FragmentOnBoardingPages>
) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return fragments[position]
    }


    override fun getCount(): Int {
        return fragments.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        Common.engOxirgiList = position
        return StringBuilder("Savol ").append(position + 1).toString()
    }
}