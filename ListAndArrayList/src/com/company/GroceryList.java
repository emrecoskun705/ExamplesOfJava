package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItems(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your list");
        for(int i=0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }


    public void modifyGroceryItems(String currentItem, String newItem) {
        int position = groceryList.indexOf(currentItem);
        if(position >= 0) {
            modifyGroceryItems(position,newItem);
        } else {
            System.out.println("Invalid Value");
        }

    }

    private void modifyGroceryItems(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
           removeGroceryItem(position);
        } else {
            System.out.println("Invalid Value");
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position =findItem(searchItem);
        if(position >= 0) {
            return true;
        }

        return false;
    }



}
