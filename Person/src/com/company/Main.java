package com.company;

public class Main {

    public static void main(String[] args) {
	Person person = new Person();

	person.setFirstName("Emre");
	person.setLastName("Coskun");
	person.setAge(34);

        System.out.println(person.isTeen());

        System.out.println(person.getFullName());


    }
}
