package com.company;

public class SIBTest {
    public static final String owner;

    static  {
        owner = "Emre";
        System.out.println("SIBTest static initialization block called");
    }

    public SIBTest() {
        System.out.println("SIB constructor called");
    }

    static {
        System.out.println("2nd static initialization block called");
    }

    public void someMethod() {
        System.out.println("someMethod() called");
    }


}
