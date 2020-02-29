package com.company;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calc = new SimpleCalculator();

        calc.setFirstNumber(5.0);
        calc.setSecondNumber(4);

        System.out.println(calc.getAdditionResult());
        System.out.println(calc.getSubtractionResult());
        System.out.println(calc.getMultiplicationResult());
        System.out.println(calc.getDivisionResult());
    }
}
