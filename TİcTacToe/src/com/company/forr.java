package com.company;

public class forr {
    public static void main(String[] args) {
        int i = 0;
        for(; i<3; i++) {
            System.out.println(i);
        }
        System.out.println("#########################");
        int j = 0;
        for(; j<3;) {
            System.out.println(j);
            j++;
        }
        System.out.println("#########################");
        outer: for( ; ; ) {
            for(int k=0; k<4; k++) {
                System.out.println(k);
                if(k==3) {
                    break outer;
                }
            }
        }


    }
}
