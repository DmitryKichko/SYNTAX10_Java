package com.collection.class22;

public class Dog extends Animal{
    int noOfLegs = 4;
    void eat(){
        System.out.println("собаки любят есть");
    }

    void  activities(){
        sleep();
        eat();
        super.eat();
    }
    void sleep(){
        System.out.println("собака может спать");
    }
    void  printLegs(){
        System.out.println(noOfLegs);
        System.out.println(super.noOfLegs);
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printLegs();

        dog.activities();
    }

}
