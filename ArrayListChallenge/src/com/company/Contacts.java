package com.company;

public class Contacts extends MobilePhone {
    private String name;
    private String phoneNumber;

    public Contacts(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


    public void addContacts(String name, String phoneNumber) {
        String contact = name + " " + phoneNumber;
        contacts.add(contact);
    }




    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
