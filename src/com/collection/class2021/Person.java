package com.collection.class2021;

public class Person {
    private String name;
    int age;
    protected double height;
    public double weight;
    public void sleep(){
        System.out.println("Person спит");
    }
    protected void eat(){
        System.out.println("Person ест");
    }
    private void walk(){
        System.out.println("Person can walk");
    }
    public static void run(){
        System.out.println("Person может бегать");
    }
}
