package com.collection.class19;

public class Book {
    /*
    Напишите программу в виде класса Book, который будет иметь переменные экземпляра и 2 конструктора.
    При создании объекта убедитесь, что:
    Инициализируются переменные экземпляра
    Выполняются оба конструктора
     */

    String name;
    int age;

    Book(String name){
        this.name=name;
        System.out.println("Этот конструктор тоже вызывается");
    }

    Book(String name, int age){
        this(name);
        this.age=age;
        System.out.println("конструктор 2");
    }
}
