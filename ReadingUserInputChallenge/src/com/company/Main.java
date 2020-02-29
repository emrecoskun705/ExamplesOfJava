package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while(counter < 10) {
            int order = counter + 1;
            System.out.println("Enter a number#" + order+";");
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                System.out.println("Number is " + number);
                counter++;
                sum += number;
            } else {
                System.out.println("Invalid number");
                hasNextInt = false;
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        System.out.println("Sum is " + sum);
        scanner.close();

    }
}
