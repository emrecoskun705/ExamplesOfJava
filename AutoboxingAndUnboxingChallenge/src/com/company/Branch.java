package com.company;

import java.util.ArrayList;

public class Branch {
    private String branchName;
    private ArrayList<Customer> customersArrayList;

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customersArrayList = new ArrayList<Customer>();
    }

    public boolean addCustomer(String name, double initialTransactions) {
        if(haveCustomer(name)) {
            System.out.println(name + " in the customerArrayList");
            return false;
        }
        this.customersArrayList.add(new Customer(name,initialTransactions));
        //System.out.println(name + " is added with initial transactions of " + initialTransactions);
        return true;
    }

    private boolean haveCustomer(String name) {
        for(int i=0; i<this.customersArrayList.size(); i++) {
            if(this.customersArrayList.get(i).getName().equals(name)) {
                return true;
            }
        }

        return false;
    }

    public boolean addTransaction(String name, double addTransaction) {
        for(int i=0; i<this.customersArrayList.size(); i++) {
            if(this.customersArrayList.get(i).getName().equals(name)) {
                addTransaction(this.customersArrayList.get(i),addTransaction);
                return true;
            }
        }
        System.out.println("Error transaction was not added");
        return false;
    }

    private boolean addTransaction(Customer customer, double addTransaction) {
        if(this.customersArrayList.contains(customer)) {
            //System.out.println("Transaction added " + addTransaction);
            customer.getTransactionsArrayList().add(addTransaction);
            return true;
        }
        System.out.println("Invalid customer");
        return false;
    }

    public void showCustomersInBranch() {
        for(int i=0; i<this.customersArrayList.size(); i++) {
            System.out.println("Customer name for position of " + (i+1) + " is " +this.customersArrayList.get(i).getName() +
                    " transaction: " +this.customersArrayList.get(i).getTransactionsArrayList());
        }
    }



    public String getBranchName() {
        return branchName;
    }

    public ArrayList<Customer> getCustomersArrayList() {
        return customersArrayList;
    }
}
