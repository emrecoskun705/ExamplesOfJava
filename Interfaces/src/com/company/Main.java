package com.company;

public class Main {

    public static void main(String[] args) {

        ITelephone emresPhone;
        emresPhone = new DeskPhone(123456);
        emresPhone.powerOn();
        emresPhone.callPhone(123456);
        emresPhone.answer();
    }
}
