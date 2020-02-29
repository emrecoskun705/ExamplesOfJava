package com.company;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    private ArrayList<Branch> branchArrayList;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.branchArrayList = new ArrayList<Branch>();
    }

    public void showCustomers(String branchName) {
        if(findBranch(branchName) != null) {
            int positionOfBranch = this.branchArrayList.indexOf(findBranch(branchName));
            this.branchArrayList.get(positionOfBranch).showCustomersInBranch();
            return;
        }
        System.out.println("Invalid branch name!");
    }

    public void showBranches() {
        for(int i=0; i<this.branchArrayList.size(); i++) {
            System.out.println((i+1) + " : " + this.branchArrayList.get(i).getBranchName());
        }
    }




    public boolean addTransaction(String branchName, String name, double addTransaction) {
        if(findBranch(branchName) != null) {
            int positionOfBranch = this.branchArrayList.indexOf(findBranch(branchName));
            this.branchArrayList.get(positionOfBranch).addTransaction(name,addTransaction);
            System.out.println("Transaction added on branch " + branchName + " to customer name " + name + " with transaction of(+) " + addTransaction);
            return true;
        }

        System.out.println("Invalid Branch");
        return false;
    }


    public boolean addCustomer(String branchName, String name, double initialTransactions) {
        if(findBranch(branchName) != null) {
            int positionOfBranch = this.branchArrayList.indexOf(findBranch(branchName));
            this.branchArrayList.get(positionOfBranch).addCustomer(name,initialTransactions);
            System.out.println("Customer added on a branch of " + branchName + " with name " + name + " with initial transaction of " + initialTransactions);
            return true;
        }
        System.out.println("Invalid branch");
        return false;
    }


    public boolean addBranch(String branchName) {
        if(!branchExists(branchName)) {
            this.branchArrayList.add(new Branch(branchName));
            System.out.println("Branch added with name " + branchName);
            return true;
        }
        System.out.println("Branch adding not successful. There is an error...");
        return false;
    }

    private boolean branchExists(String branchName) {
        for(int i=0; i<this.branchArrayList.size(); i++) {
            if(this.branchArrayList.get(i).getBranchName().equals(branchName)) {
                return true;
            }
        }
        return false;
    }

    public Branch findBranch(String branchName) {
        for(int i=0; i<this.branchArrayList.size(); i++) {
            if(this.branchArrayList.get(i).getBranchName().equals(branchName)) {
                return this.branchArrayList.get(i);
            }
        }

        return null;
    }



    public String getBankName() {
        return bankName;
    }

    public ArrayList<Branch> getBranchArrayList() {
        return branchArrayList;
    }
}
