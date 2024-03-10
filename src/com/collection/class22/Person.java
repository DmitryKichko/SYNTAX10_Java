package com.collection.class22;

public class Person {
    String name;
    int age;
    double height;
    double weight;
    Person(String name, int age, double height, double weight){
        this.name=name;
        this.age=age;
        this.height=height;
        this.weight=weight;
    }
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println(name + " может есть");
    }
    public void sleep(){
        System.out.println(name + " спит все время");
    }

}
