package com.company;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {

    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java already exist");
        } else {
            languages.put("Java", "a compiled high level, object-oriented");
            System.out.println("Java added");
        }

        languages.put("Python", "an interpreted, high-level, object oriented");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("BASIC" , "Beginners all purposes"));
        System.out.println(languages.put("LISP" , "Therein lies madness"));

        if(languages.containsKey("Java")) {
            System.out.println("Java already exist");
        } else {
            languages.put("Java", "a compiled high level, object-oriented");
        }

        System.out.println("==================================================================");

//        languages.remove("LISP");

        if(languages.remove("Algol", "an algorithmic language")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed");
        }

        if(languages.replace("LISP", "Therein lies madness","a functional programming language with imperative features")) {
            System.out.println("LISP replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
        System.out.println(languages.replace("Scala", "This will not work"));

        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
