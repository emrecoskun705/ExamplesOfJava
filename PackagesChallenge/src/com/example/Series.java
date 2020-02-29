package com.example;

import java.util.ArrayList;

public class Series {

    public static int nSum(int number) {
        if(number < 0) {
            return -1;
        }
        return (number*(number + 1)) / 2;
    }

    public static int factorial(int number) {
        if(number < 0 ) {
            return -1;
        } else if (number == 1) {
            return 1;
        } else {
            int outputNumber = 1;
            for(int i=1; i<=number; i++) {
                outputNumber *= i;
            }
            return outputNumber;
        }
    }



    public static int fibonacci(int number) {
        ArrayList<Integer> fibLst = new ArrayList();
        fibLst.add(0);
        fibLst.add(1);
        for (int i=0; i<number; i++) {
            fibLst.add(fibLst.get(i) + fibLst.get(i+1));
        }
        return fibLst.get(number);
    }


}
