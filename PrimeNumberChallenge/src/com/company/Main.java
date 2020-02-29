package com.company;

public class Main {

    public static void main(String[] args) {
        int cnt = 0;
        for(int j=10 ; j<50; j++) {
            if(isPrime(j)) {
                cnt ++;
                System.out.println(j + " is prime number.");
                if (cnt == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for(int i=2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
