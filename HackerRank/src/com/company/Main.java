package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.print(s1);
            int a = 15 - s1.length();
            for(int j=0; j<a; j++) {
                System.out.print(" ");
            }

            System.out.printf("%03d",x);
            System.out.println();
        }

        System.out.println("================================");
    }
}
