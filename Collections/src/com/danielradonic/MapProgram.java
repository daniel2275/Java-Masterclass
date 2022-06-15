package com.danielradonic;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages = new HashMap<>();
        if (languages.containsKey("Java")) {
            System.out.println("Java already exists");
        } else {
            languages.put("Java", "a compiled high level, object-oriented, platform independent language");
            System.out.println("Java added successfully");
        }

        languages.put("Python", "an interpreted, object oriented, high-level programming language");
        languages.put("Algol", "an algorithmic language");
        System.out.println(languages.put("Basic", "Beginners All-purpose Symbolic Instruction Code"));
        System.out.println(languages.put("Lisp", "Therein lies madness"));


        if (languages.containsKey("Java")) {
            System.out.println("Java is already in the map");
        } else {
            languages.put("Java", "this course is about Java");
            System.out.println("Java added successfully");
        }

        System.out.println("============================================================================");

        //languages.remove("Lisp");
        if (languages.remove("Algol", "a family of algorithmic languages")) {
            System.out.println("Algol removed");
        } else {
            System.out.println("Algol not removed, key/value pair not found");
        }


        //System.out.println(languages.replace("Lisp", "a functional programming language with imperative features 443"));

        if(languages.replace("Lisp", "Therein lies madness", "a functional programming language with imperative features")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }


        for (String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }




    }
}
