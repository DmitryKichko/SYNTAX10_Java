package com.collection.class28;

public class PersonTester {

    public static void main(String[] args) {

        Person person = new Person();

        person.setName("Sule");
        person.setAge(65);
        person.setSSN("12345678");
        System.out.println(person.getName());
       System.out.println(person.getAge("12345678"));



    }
}
