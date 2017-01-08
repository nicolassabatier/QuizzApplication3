package com.example.nicolassabatier.quizzapplication;

import android.os.Parcelable;
import android.os.Parcel;

import java.io.Serializable;

/**
 * Created by Nicolassabatier on 02/01/2017.
 */

public class Question implements Serializable {
    private int ID;
    private String Image;
    private String AnswerA;
    private String AnswerB;
    private String AnswerC;
    private String AnswerD;
    private String CorrectAnswer;


    public Question(int ID, String image, String answerA, String answerB, String answerC, String answerD, String correctAnswer) {
        this.ID = ID;
        Image = image;
        AnswerA = answerA;
        AnswerB = answerB;
        AnswerC = answerC;
        AnswerD = answerD;
        CorrectAnswer = correctAnswer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getAnswerA() {
        return AnswerA;
    }

    public void setAnswerA(String answerA) {
        AnswerA = answerA;
    }

    public String getAnswerB() {
        return AnswerB;
    }

    public void setAnswerB(String answerB) {
        AnswerB = answerB;
    }

    public String getAnswerC() {
        return AnswerC;
    }

    public void setAnswerC(String answerC) {
        AnswerC = answerC;
    }

    public String getAnswerD() {
        return AnswerD;
    }

    public void setAnswerD(String answerD) {
        AnswerD = answerD;
    }

    public String getCorrectAnswer() {
        return CorrectAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        CorrectAnswer = correctAnswer;
    }
}

//public class Question implements Parcelable {
//    private int ID;
//    private String Image;
//    private String AnswerA;
//    private String AnswerB;
//    private String AnswerC;
//    private String AnswerD;
//    private String CorrectAnswer;
//
//
//    public Question(int ID, String image, String answerA, String answerB, String answerC, String answerD, String correctAnswer) {
//        this.ID = ID;
//        Image = image;
//        AnswerA = answerA;
//        AnswerB = answerB;
//        AnswerC = answerC;
//        AnswerD = answerD;
//        CorrectAnswer = correctAnswer;
//    }
//
//    public int getID() {
//        return ID;
//    }
//
//    public void setID(int ID) {
//        this.ID = ID;
//    }
//
//    public String getImage() {
//        return Image;
//    }
//
//    public void setImage(String image) {
//        Image = image;
//    }
//
//    public String getAnswerA() {
//        return AnswerA;
//    }
//
//    public void setAnswerA(String answerA) {
//        AnswerA = answerA;
//    }
//
//    public String getAnswerB() {
//        return AnswerB;
//    }
//
//    public void setAnswerB(String answerB) {
//        AnswerB = answerB;
//    }
//
//    public String getAnswerC() {
//        return AnswerC;
//    }
//
//    public void setAnswerC(String answerC) {
//        AnswerC = answerC;
//    }
//
//    public String getAnswerD() {
//        return AnswerD;
//    }
//
//    public void setAnswerD(String answerD) {
//        AnswerD = answerD;
//    }
//
//    public String getCorrectAnswer() {
//        return CorrectAnswer;
//    }
//
//    public void setCorrectAnswer(String correctAnswer) {
//        CorrectAnswer = correctAnswer;
//    }
//
//    protected Question(Parcel in) {
//        ID = in.readInt();
//        Image = in.readString();
//        AnswerA = in.readString();
//        AnswerB = in.readString();
//        AnswerC = in.readString();
//        AnswerD = in.readString();
//        CorrectAnswer = in.readString();
//    }
//
//    @Override
//    public int describeContents() {
//        return 0;
//    }
//
//    @Override
//    public void writeToParcel(Parcel dest, int flags) {
//        dest.writeInt(ID);
//        dest.writeString(Image);
//        dest.writeString(AnswerA);
//        dest.writeString(AnswerB);
//        dest.writeString(AnswerC);
//        dest.writeString(AnswerD);
//        dest.writeString(CorrectAnswer);
//    }
//
//    @SuppressWarnings("unused")
//    public static final Parcelable.Creator<Question> CREATOR = new Parcelable.Creator<Question>() {
//        @Override
//        public Question createFromParcel(Parcel in) {
//            return new Question(in);
//        }
//
//        @Override
//        public Question[] newArray(int size) {
//            return new Question[size];
//        }
//    };
//}
