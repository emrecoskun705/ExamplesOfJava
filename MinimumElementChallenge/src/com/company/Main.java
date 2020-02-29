package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(10)));

    }

    public static int[] readIntegers(int number) {
        System.out.println("Enter " + number + " integers.");
        int[] values = new int[number];

        for(int i=0; i<number; i++) {
            values[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return values;
    }

    public static int findMin(int[] array) {
        int a = 0;
        boolean flag = true;

        for(int i=0; i<array.length; i++) {
            if(a == 0 && flag) {
                a = array[i];
                flag = false;
            } else if (array[i] < a) {
                a = array[i];
            }
        }
        return a;
    }
}
