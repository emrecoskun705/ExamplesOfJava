package com.company;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private String phoneNumber;

    public BankAccount() {
        this(1111,0,"default name", "default email", "0000000");
        System.out.println("Empty constructor called");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String eMail, String phoneNumber) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;

    }

    public double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
///////////////////////////////////////////////////////////////////////////////////*******************************************
    public void depositFunds(int amount) {
        System.out.println("Previous balance : " + this.balance);
        this.balance += amount;
        System.out.println("New balance : " + this.balance);
    }

    public void withdraw(int amount) {
        if(amount > this.balance || amount < 10) {
            System.out.println("Invalid amount");
        } else {
            System.out.println("Previous balance : " + this.balance);
            this.balance -= amount;
            System.out.println("New balance : " + this.balance);
        }
    }


}
