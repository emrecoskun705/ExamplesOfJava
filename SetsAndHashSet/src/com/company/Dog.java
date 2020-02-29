package com.company;

public class Dog {
    private final String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public final boolean equals(Object obj) {
        //if we add final subclass cannot use equals method
        if(this == obj) {
            return true;
        }

        if(obj instanceof Dog) {
            String objName = (((Dog) obj).getName());
            return this.name.equals(objName);
        }

        return false;
    }
}

