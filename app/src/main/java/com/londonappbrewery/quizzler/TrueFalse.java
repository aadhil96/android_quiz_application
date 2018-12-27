package com.londonappbrewery.quizzler;

/**
 * Created by Aadhil on 3/27/2018.
 */

public class TrueFalse {
    private int mQuestionID;
    private boolean mAnswer;

    public TrueFalse(int questionRecourceID,boolean trueOrFalse){
        mQuestionID = questionRecourceID;
        mAnswer = trueOrFalse;
    }


    public int getQuestionID() {
        return mQuestionID;
    }

    public void setQuestionID(int questionID) {
        mQuestionID = questionID;
    }

    public boolean isAnswer() {
        return mAnswer;
    }

    public void setAnswer(boolean answer) {
        mAnswer = answer;
    }
}
