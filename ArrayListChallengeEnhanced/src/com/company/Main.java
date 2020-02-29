package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("545 841 3575");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while(!quit) {
            System.out.println("\n Enter action");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;

            }

        }

    }

    public static void updateContact() {
        System.out.println("Enter an existing contact name: ");
        String oldContactName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldContactName);
        if(oldContact==null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newPhone = scanner.nextLine();

        Contact newContact = Contact.createContact(newName, newPhone);
        if (mobilePhone.updateContact(oldContact,newContact)) {
            System.out.println("Successfully updated");
        } else {
            System.out.println("Error updating contact");
        }
    }

    public static void removeContact() {
        System.out.println("Enter an existing contact name: ");
        String oldContactName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldContactName);
        if (oldContact == null) {
            System.out.println("Contact not found");
            return;
        }

        if(mobilePhone.removeContact(oldContact)) {
            System.out.println("Successfully deleted");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    public static void queryContact() {
        System.out.println("Enter an existing contact name: ");
        String oldContactName = scanner.nextLine();
        Contact oldContact = mobilePhone.queryContact(oldContactName);
        if (oldContact == null) {
            System.out.println("Contact not found");
            return;
        }

        System.out.println("Name " + oldContact.getName() + " phone number is " + oldContact.getPhoneNumber());
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createContact(name,phone);
        if(mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: name " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add, " + name + " already on file");
        }
    }



    private static void startPhone() {
        System.out.println("Starting phone...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\nPress:");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                            "2 - to add a new contact\n" +
                            "3 - to update an existing an existing contact\n " +
                            "4 - to remove an existing contact\n" +
                            "5 - query if an existing contact exists\n" +
                            "6 - to print a list of available actions.");
        System.out.println("Choose your action");
    }

    private static void printContacts() {
        mobilePhone.printContacts();
    }
}
