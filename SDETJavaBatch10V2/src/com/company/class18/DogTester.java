package com.company.class18;

public class DogTester {
    public static void main(String[] args) {
        Dog dog4=new Dog();
        dog4.printDogInfo();


        Dog dog2=new Dog("Boby");
        dog2.printDogInfo();

        Dog dog3=new Dog("Jimmi", 28);
        dog3.printDogInfo();


        Dog dog1=new Dog("Tommy",10,
                12.5,25,"Buldog","White");
        dog1.printDogInfo();

    }
}
