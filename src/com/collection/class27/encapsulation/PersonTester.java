package com.collection.class27.encapsulation;

public class PersonTester {

    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Dimitry");
        person.setAge(25);
        person.setWeight(80);

        /* person.name = "Dimitry";
        person.age = 16;
        person.height = 30;
        person.weight = 5; */
        person.printInfo();

        Person person1 = new Person();
        /* person.name = "Mike";
        person.age = 120;
        person.height = 2000;
        person.weight = 15; */
        person.printInfo();
    }
}
