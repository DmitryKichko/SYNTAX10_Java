package com.collection.class19;

import java.util.Scanner;

public class PersonTester {


    public static void main(String[] args) {

         Person person1 = new Person("Дмитрий", 26);

         person1.printInfo();

        Person person3 = new Person(25, "Дима");

        person3.printInfo();

        Scanner scan = new Scanner(System.in);

        Person person2 = new Person(scan.next(), scan.nextInt());
        person2.printInfo();

    }
}
