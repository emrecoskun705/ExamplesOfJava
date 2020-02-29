package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = 0;//Integer.MAX_VALUE;
        int max = 0;//Integer.MIN_VALUE;
        boolean first = true; //flag

        while(true) {
            System.out.println("Enter number:");
            boolean isIntNumber = scanner.hasNextInt();
            if(isIntNumber) {
                int number = scanner.nextInt();

                if(first) {
                    first = false;
                    max = number;
                    min = number;
                }

                if (number > max) max = number;
                if (number < min) min = number;
            } else {
                System.out.println("Min number: " + min + " Max number: " + max );
                break;
            }
            scanner.nextLine();
        }

        scanner.close();

    }
}
