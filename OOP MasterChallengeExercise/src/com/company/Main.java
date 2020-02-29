package com.company;

public class Main {

    public static void main(String[] args) {
        HealthyBurger healthyBurger = new HealthyBurger("susage",4.35);
        healthyBurger.addHamburgerAddition1("ketchup" , 0.10);
        healthyBurger.addHealthyExtra1("tomato", 0.24);
        System.out.println(healthyBurger.itemizeHamburger());

    }
}
