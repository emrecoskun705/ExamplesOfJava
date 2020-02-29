package com.company;

public class Main {

    public static void main(String[] args) {

        float myMaxFloatNumber = Float.MAX_VALUE;
        float myMinFloatNumber = Float.MIN_VALUE;
        System.out.println("Max float number = " + myMaxFloatNumber);
        System.out.println("Min float number = " + myMinFloatNumber);

        double myMaxDoubleNumber = Double.MAX_VALUE;
        double myMinDoubleNumber = Double.MIN_VALUE;
        System.out.println("Max double number = " + myMaxDoubleNumber);
        System.out.println("Min double number = " + myMinDoubleNumber);

        int myIntValue = 5;
        float myFloatNumber = 5f / 3f;
        double myDoubleNumber = 5d / 3d;
        System.out.println(myIntValue);
        System.out.println(myFloatNumber);
        System.out.println(myDoubleNumber);

        double pounds = 0.45359237d;
        double kilogram = 200d;
        double answer = pounds * kilogram;
        System.out.println(answer);

        

    }
}
