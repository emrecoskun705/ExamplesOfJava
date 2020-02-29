package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMaxValue = Integer.MAX_VALUE;
        int myMinValue = Integer.MIN_VALUE;
        System.out.println(myMaxValue);
        System.out.println(myMinValue);

        int myMaxValueTest = 2_147_483_647;
        System.out.println(myMaxValueTest);

        byte myByteMaxValue = Byte.MAX_VALUE;
        byte myByteMinValue = Byte.MIN_VALUE;
        System.out.println("Max byte value = " + myByteMaxValue);
        System.out.println("Min byte value = " + myByteMinValue );

        short myShortMaxValue = Short.MAX_VALUE;
        short myShortMinValue = Short.MIN_VALUE;
        System.out.println("Max short value = " + myShortMaxValue);
        System.out.println("Min short value = " + myShortMinValue );

        long myLongValue = 100L;

        long myLongMaxValue = Long.MAX_VALUE;
        long myLongMinValue = Long.MIN_VALUE;
        System.out.println("Max long value = " + myLongMaxValue);
        System.out.println("Min long value = " + myLongMinValue );

        long myRealLongValue = 2_147_483_648L;
        System.out.println(myRealLongValue);

        short bigShortValue = 32767;

        int myTotal = (myValue / 2);

        byte myNewByteValue = (byte) (myByteMinValue / 2);

        short myNewShortValue = (short) (myByteMinValue / 2);

        byte myBnumber = 90;
        short mySnumber = 145;
        int myInumber = 45;

        long myLnumber = 50000 + 10*(myBnumber + mySnumber + myInumber);
        System.out.println(myLnumber);

    }
}
