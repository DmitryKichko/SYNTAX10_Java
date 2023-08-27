package com.company.class16;

public class Dog {
    static int noOfLegs=4;
    String name; // instance variable (экземплярная переменная)
   String Breed; // static variable (статическая переменная)
    String color;

    void bark(){
        int times = 10; // local variable (локальная переменная)
        for (int i=0; i< times; i++) {
            System.out.println("Dog can bark");
        }
    }
}
