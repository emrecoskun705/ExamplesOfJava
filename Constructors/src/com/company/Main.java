package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount emre = new BankAccount();
//
//        System.out.println(emre.getBalance());
//        System.out.println(emre.getPhoneNumber());
//
//        emre.depositFunds(23);

        VipCustomer emre = new VipCustomer("efds",250,"em@hot.com");

        System.out.println(emre.getName());
        System.out.println(emre.getCreditLimit());
        System.out.println(emre.geteMail());

    }
}
