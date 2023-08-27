package com.collection.class16;

public class DogTester {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "James";
        dog1.color = "серая";

        Dog.Bread = "Хаски";

        Dog dog2 = new Dog();
        dog2.name = "Boby";
        dog2.color = "белая";

        System.out.println(Dog.Bread);


    }
}
