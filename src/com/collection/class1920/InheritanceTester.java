package com.collection.class1920;

public class InheritanceTester {

    public static void main(String[] args) {

        Developer developer = new Developer();
        developer.eat();

        Tester tester = new Tester();
        tester.name = "Blake";
        tester.eat();
        tester.testCode();

    }

}
