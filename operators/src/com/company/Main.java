package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 2 + 3; // 2 + 3 = 5
        System.out.println(result);

        result = result * 5; // 25
        System.out.println(result);

        result++;
        System.out.println("25 + 1 = " + result);

        result--;
        System.out.println("26 - 1 = " + result);

        result += 5;
        System.out.println("25 + 5 = " + result);

        result -= 4;
        System.out.println("30 - 4 = " + result);

        result *= 2;
        System.out.println("26 * 2 = " + result);

        boolean emre = false;

        if (emre == false) {
            System.out.println("hi");
            System.out.println("sd");
        }
        int anumber = 79;
        int anumber2 = 80;

        if (anumber < anumber2 && anumber < 100) {
            System.out.println("all true");
        }

        if ((anumber > 90) || (anumber2 > 90)) {
            System.out.println("one of them or all of them true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("aslkşd");
        }

        int a = 20;
        boolean emree = (a == 20)? true : false;
        if (emree) {
            System.out.println("yess");
        }
    }
}
