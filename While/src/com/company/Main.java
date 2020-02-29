package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//            while (count != 6) {
//                System.out.println("Count is " + count);
//                count++;
//            }
//
//            count = 3;
//            do {
//                System.out.println("Count value was " + count);
//                count++;
//            } while (count < 40);

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            count ++;
            System.out.println("Even number " + number);
            if (count == 5) {
                break;
            }
        }
        System.out.println(count);


    }

    public static boolean isEvenNumber(int number) {
        return (number % 2 == 0);
    }
}
