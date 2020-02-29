package com.company;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
        System.out.println(StaticTest.getNumInstances());

        int answer = multiply(3);
        System.out.println(answer);


    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
