package com.company;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactionsArrayList;

    public Customer(String name, double initialTransaction) {
        this.name = name;
        this.transactionsArrayList = new ArrayList<Double>();
        addTransactions(initialTransaction);
    }

    public void addTransactions(double transaction) {
        transactionsArrayList.add(Double.valueOf(transaction));
    }


    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactionsArrayList() {
        return transactionsArrayList;
    }
}
