package com.example.nicolassabatier.quizzapplication;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicolassabatier on 20/12/2016.
 */

public class Player implements Serializable {


    private int score;
    private String name;
    private String email;

    public Player(){}

    public Player(int score, String name, String email) {
        this.score = score;
        this.name = name;
        this.email = email;
    }





    public void setName(String name) {
        this.name = name;

    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
