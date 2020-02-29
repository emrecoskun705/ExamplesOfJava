package com.company;

import java.util.Scanner;

public class Main {

private static Scanner scanner = new Scanner(System.in);
private static Bank bank = new Bank("ING");

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;

        instructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    instructions();
                    break;
                case 2:
                    addBranch();
                    break;
                case 3:
                    addCustomer();
                    break;
                case 4:
                    addTransaction();
                    break;
                case 5:
                    showCustomers();
                    break;
                case 6:
                    showBranches();
                    break;
            }
        }
    }

    private static void instructions() {
        System.out.println("\t0 -- to quit\n" +
                            "\t1 -- for instructions\n" +
                            "\t2 -- to add new branch\n" +
                            "\t3 -- to add new customer\n" +
                            "\t4 -- to add transaction\n" +
                            "\t5 -- to show customers\n" +
                            "\t6 -- to show branches\n");
    }

    private static void addBranch() {
        System.out.println("Enter a branch name: ");
        String branchName = scanner.nextLine();
        bank.addBranch(branchName);
    }

    private static void addCustomer() {
        System.out.println("Enter a valid branch name: ");
        String branchName = scanner.nextLine();
        System.out.println(branchName);

        System.out.println("Enter a customer name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Enter initial transaction: ");
        double initialTransaction = scanner.nextDouble();
        System.out.println(initialTransaction);


        bank.addCustomer(branchName,name,initialTransaction);
    }

    private static void addTransaction() {
        System.out.println("Enter a valid branch name: ");
        String branchName = scanner.nextLine();

        System.out.println("Enter a customer name: ");
        String name = scanner.nextLine();

        System.out.println("Enter initial transaction: ");
        double addTransaction = scanner.nextDouble();


        bank.addTransaction(branchName,name,addTransaction);
    }

    private static void showCustomers() {
        System.out.println("Enter a valid branch name: ");
        String branchName = scanner.nextLine();

        bank.showCustomers(branchName);
    }

    private static void showBranches() {
        bank.showBranches();
    }










}
