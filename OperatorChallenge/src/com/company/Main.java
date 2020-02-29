package com.company;

public class Main {

    public static void main(String[] args) {

        double value1 = 20.20d;
        double value2 = 80.00d;

        double sumOf1and2 = (value1 + value2) * 100;
        double remain = sumOf1and2 % 40.00;

        boolean trueOrFalse = (remain == 0)? true : false;
        System.out.println(trueOrFalse);

        if (!trueOrFalse) {
            System.out.println("Got some remainder");
        }



    }
}
