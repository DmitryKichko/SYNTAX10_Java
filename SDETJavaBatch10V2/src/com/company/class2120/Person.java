package com.company.class2120;

import com.company.class20.Developer;

public class Person {
    String name;
    int age;
    protected double height;
    public double weight;

    public void sleep(){
        System.out.println("Person is sleeping");
    }
    protected void eat(){
        System.out.println("Person is eating");
    }
    private void walk(){
        System.out.println("Person can walk");
    }
    public static void run(){
        System.out.println("person can run");
    }
}
