package com.company;

import java.util.ArrayList;
import java.util.Scanner;


public class MobilePhone {
    public ArrayList<String> contacts = new ArrayList<String>();
    private Scanner scanner = new Scanner(System.in);

    private void printContacts() {
        for(int i=0; i<contacts.size(); i++) {
            System.out.println((i+1) + ". :" + contacts.get(i));
        }
    }

    public void menu() {
        System.out.println("Choose one:");

        int choice = 0;
        boolean quit = false;

        System.out.println("\tChoose one:");
        System.out.println("\t 0 : instructions ");
        System.out.println("\t 1 : print contacts ");
        System.out.println("\t 2 : add contacts ");
        System.out.println("\t 3 : print contacts ");
        System.out.println("\t 4 : quit menu ");

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    System.out.println("\t 0 : instructions ");
                    System.out.println("\t 1 : print contacts ");
                    System.out.println("\t 2 : add contacts ");
                    System.out.println("\t 3 : update contacts ");
                    System.out.println("\t 4 : quit menu ");
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContacts();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    quit = true;
                    break;
            }

        }


    }

    public void addContacts() {
        System.out.println("Enter a name");

        String name = scanner.nextLine();
        System.out.println("Enter a phone number");
        String phoneNumber1 = scanner.nextLine();
        addContacts(name,phoneNumber1);
    }

    private void addContacts(String name, String phoneNumber) {
        String contact = name + " " + phoneNumber;
        System.out.println(contact);
        contacts.add(contact);
    }


    private void updateContact() {
        System.out.println("Enter the position of contact");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter the new name of contact");
        String newName = scanner.nextLine();
        System.out.println("Enter the new number of contact");
        String newNumber = scanner.nextLine();

        updateContact(position,newName,newNumber);
    }

    private void updateContact(int position, String newName, String newNumber) {
        contacts.set(position-1, newName + " " + newNumber);
    }

}






