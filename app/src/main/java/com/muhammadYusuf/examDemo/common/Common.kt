package com.muhammadYusuf.examDemo.common

import com.muhammadYusuf.examDemo.fragment.boarding.FragmentOnBoardingPages
import com.muhammadYusuf.examDemo.model.BoardingModel
import com.muhammadYusuf.examDemo.model.CurrentQuestion

object Common {
    var GET_FREE_QUESTIONS = "free_questions"
    var hozirgiSavol = 0
    var engOxirgiList = 0
    var timer = 0
    var togriJavoblar = 0
    var number = 0
    var tenlanganJavoblar: List<String> = ArrayList()
    var togriJavoblarDatabasedan: List<String> = ArrayList()
    var onlineDBcorrectAnswers: List<String> = ArrayList()
    var tanlanganOnlineDBJavoblar: List<String> = ArrayList()
    var questionNumbers: ArrayList<BoardingModel> = ArrayList<BoardingModel>()
    var currentQuestions= ArrayList<CurrentQuestion>()
    var fragmentQuestions: ArrayList<FragmentOnBoardingPages> = ArrayList<FragmentOnBoardingPages>()
}