package com.muhammadYusuf.examDemo.model;

public class CurrentQuestion {
    private int questionIndex;

    public CurrentQuestion(int questionIndex) {
        this.questionIndex = questionIndex;
    }

    public int getQuestionIndex() {
        return questionIndex;
    }

    public void setQuestionIndex(int questionIndex) {
        this.questionIndex = questionIndex;
    }
}
