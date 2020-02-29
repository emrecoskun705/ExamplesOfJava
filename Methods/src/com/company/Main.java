package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int a = calculateScore(gameOver, score , levelCompleted , bonus);
        System.out.println(a);

        gameOver = false;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int b = calculateScore(gameOver, score , levelCompleted , bonus);
        System.out.println(b);


        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("em",highScorePosition );

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("al",highScorePosition );

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("um",highScorePosition );

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("öm",highScorePosition );

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("je",highScorePosition );
    }

    public static void displayHighScorePosition(String name , int position) {
        System.out.println(name + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if ((score >= 500)) {
            return 2;
        } else if ( (score >= 100)) {
            return 3;
        } else {
            return 4;
        }
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;


    }

}
