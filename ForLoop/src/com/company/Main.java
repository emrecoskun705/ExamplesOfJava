package com.company;

public class Main {

    public static void main(String[] args) {
//        for(int i=2; i<9; i++) {
//            System.out.println("10.000 at rate " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,(double) i))); //double is not necessary!!
//        }

        for(int i=8; i>=2; i--) {
            System.out.println("10.000 at rate " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,(double) i))); //double is not necessary!!

        }

    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
