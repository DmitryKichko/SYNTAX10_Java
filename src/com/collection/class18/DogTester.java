package com.collection.class18;

public class DogTester {

    public static void main(String[] args) {

        Dog dog = new Dog("Tommy" , 10,
                12.5, 25,
                "Bulldog", "White");
        dog.printDogInfo();

        Dog dog2 = new Dog("Body");
        dog2.printDogInfo();

        Dog dog3 = new Dog("Jimmi", 20);
        dog3.printDogInfo();

        Dog dog4 = new Dog("",22 , 51);
        dog4.printDogInfo();

        Dog dog5 = new Dog();
        dog5.printDogInfo();

    }
}
