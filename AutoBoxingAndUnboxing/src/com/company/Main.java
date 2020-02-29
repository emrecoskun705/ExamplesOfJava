package com.company;

import java.util.ArrayList;

class IntClass {
    private int integer;

    public IntClass(int integer) {
        this.integer = integer;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }
}

public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int[5];

        ArrayList<String> stringArrayList = new ArrayList<String>();
        stringArrayList.add("Emre");

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(23));

        Integer integer = 4; //new Integer(34);
        Double doubleValue = 34.3; //new Double(34.3);

        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
//
//        for(int i=0; i<10; i++) {
//            integerArrayList.add(Integer.valueOf(i));
//        }
//
//        for(int i=0; i<integerArrayList.size(); i++) {
//            System.out.println(integerArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue.intValue();// myIntValue;

        ArrayList<Double> doubleArrayList = new ArrayList<Double>();

        for(double dbl=0.0; dbl<=10.0; dbl = dbl + 0.5) {
            doubleArrayList.add(Double.valueOf(dbl)); // or doubleArrayList.add(dbl);
        }

        for(int i=0; i<doubleArrayList.size(); i++) {
            System.out.println(doubleArrayList.get(i).doubleValue()); // or System.out.println(doubleArrayList.get(i));
        }


    }
}
