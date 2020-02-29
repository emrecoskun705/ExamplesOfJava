package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myIntArray = getIntegers(9);
        int[] sorted = sortIntegers(myIntArray);
        printArray(sorted);

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integers.\r");
        int[] values = new int[number];

        for (int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }
        return values;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
//        int[] sortedList = new int[array.length];
//
//        for(int i=0; i<array.length; i++) {
//            sortedList[i] = array[i];
//        }

        int[] sortedList = Arrays.copyOf(array,array.length);

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;
            for(int i=0; i<sortedList.length-1; i++) {
                if(sortedList[i] < sortedList[i+1]) {
                 temp = sortedList[i];
                 sortedList[i] = sortedList[i+1];
                 sortedList[i+1] = temp;
                 flag = true;
                }
            }
        }

        return sortedList;
    }
}