package com.collection.class26.casting;

public class AnimalTester {

    public static void main(String[] args) {


        Animal animal1 = new Cat();

       if(animal1 instanceof Cat) {
           Cat cat = (Cat)animal1;
           ((Cat)animal1).meow();

       }
    }
}
