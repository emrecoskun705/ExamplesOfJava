package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore("emre" ,500);
        calculateScore(300);
        calculateScore();

        double a = calcFeetAndInchesToCentimeters(6,-10);
        double b = calcFeetAndInchesToCentimeters(5);
        System.out.println(a);
        System.out.println(b);
    }

    public static int calculateScore(String playername, int score) {
        System.out.println(playername + " has a score of " + score);
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Score is " + score);
        return score * 500;
    }

    public static int calculateScore() {
        System.out.println("No score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double centimeters = feet * 30.48;
            centimeters += inches * 2.54;
            return centimeters;

        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12 ;
            return  feet + remainingInches;
        } else {
            return -1;
        }
    }
}
