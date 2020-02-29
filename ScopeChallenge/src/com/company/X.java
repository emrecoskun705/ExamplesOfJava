package com.company;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please enter a number:");
        this.x = x.nextInt();
    }

    public void x() {
        for(int i=1; i<=12; i++) {
            System.out.println(x + " times " + i + " = " + (x*i));
        }
    }
}
