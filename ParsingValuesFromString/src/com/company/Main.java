package com.company;

public class Main {

    public static void main(String[] args) {
        String numberString = "2019.34";
        System.out.println("number is " + numberString);

//        int number = Integer.parseInt(numberString);
//        number += 1;
//        System.out.println(number);

        double number2 = Double.parseDouble(numberString);
        number2 += 3.43;
        System.out.println(number2);

    }
}
