package com.collection.class19;

// чтобы закоментировать необходимые поля, нужно выделить поля которые мы хотим закоментировать на нажать CMD+Shift+/ (и так же обратно)

public class Person {

    String name;
    int age;
    double weight;
    double height;
    String education;

    Person(){
        System.out.println("Важные строки кода, которые всегда должны " +
                "выполняться при создании объекта данного класса ");

        name = "None";
        age = 30;
        weight = 50;
        height = 5.5;
        education = "None";
    }
    Person(String personName){
        this(); // вызывает конструктор без аргументов
        System.out.println("1-й конструктор");

        name = personName;

    }
    Person(String personName, int personAge){
        this(personName);
        System.out.println("1-й конструктор");
        age = personAge;
    }

    void printInfo(){
        System.out.println("Name: " + name +" age: " + age +
                " weight: " + weight + " height: " + height + " education: " + education);
    }

    Person(int personAge, String personName){
        System.out.println("2-й конструктор");

        name = personName;
        age = personAge;
        weight = 10;
        height = 2.5;
        education = "None";

    }
}
