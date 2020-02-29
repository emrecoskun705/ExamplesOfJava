package com.company;

public class Main {

    public static void main(String[] args) {

        byte myBnumber = 90;
        short mySnumber = 145;
        int myInumber = 45;

        long myLnumber = 50000L + 10L * (myBnumber + myInumber +mySnumber);
        System.out.println(myLnumber);

        short myNewShortNumber = (short) (500 + 10 * (myBnumber + myInumber +mySnumber));
        System.out.println(myNewShortNumber);
    }
}
