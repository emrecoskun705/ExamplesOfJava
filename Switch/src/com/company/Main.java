package com.company;

public class Main {

    public static void main(String[] args) {
        int switchValue = 10;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was" + switchValue);
                break;
            default:
                System.out.println("Value was not 1,2,3,4,5");
                break;
        }

        char newChar = '\u0054'; // or we can write 'P'

        switch (newChar) {
            case '\u0051':
                System.out.println("It is " + newChar);
                break;
            case '\u0052':
                System.out.println("It is " + newChar);
                break;
            case '\u0050':
                System.out.println("It is " + newChar);
                break;
            default:
                System.out.println("It ıs not " + '\u0050' +" " + '\u0052' + " " + '\u0051' );
                break;

        }


    }
}
