package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] myIntArray = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(myIntArray));
	    reverse(myIntArray);
        System.out.println(Arrays.toString(myIntArray));
    }

    private static void reverse(int[] array) {
        int[] cloneArray = Arrays.copyOf(array,array.length);

        for(int i=0; i<array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length-1 - i];
            array[array.length-1 - i] = temp;

        }

//        for(int i=0; i<array.length/2; i++) {
//            array[array.length -1 - i] = cloneArray[i];
//        }
    }

}
