package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        int a = 1000;
        int b = 2000;
        int c = 900;

        if ((c < b) && (c >a)) {
            System.out.println("First");
        } else if (c > b) {
            System.out.println("Second");
        } else {
            System.out.println("third");
        }

    }
}
