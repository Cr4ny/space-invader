package com.brightstraining.javafxgame.model;

public class ScoreBoard {
    public static double score=0;


    public void getScoreTitle(){

    }public void getScoreTitle2(){
=======
    public String scoreTitle="Score: ";

    private void getscoreTitle(){


    }

    public double update(){
        return score++;
    }

    @Override
    public String toString() {
        return "Score:" + (int)score ;
    }
}
