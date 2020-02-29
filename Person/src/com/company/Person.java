package com.company;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName1) {
        this.firstName = firstName1;
    }

    public void setLastName(String lastName1) {
        this.lastName = lastName1;
    }

    public void setAge(int age1) {
        if ((age1 > 100) || (age1 < 0)) {
            this.age = 0;
        } else {
            this.age = age1;
        }
    }

    public boolean isTeen() {
        if((age > 12) && (age < 20)) return true;
        return false;
    }

    public String getFullName() {
        if(firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (firstName.isEmpty()) {
            return lastName;
        } else if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName;
}}
