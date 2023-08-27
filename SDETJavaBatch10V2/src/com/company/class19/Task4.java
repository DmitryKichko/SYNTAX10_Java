package com.company.class19;

public class Task4 {
    /*
   1. Write a Student class that have instance variable name and address.
    Create a constructor that will initialize those variable.
    Print name & address of given student using displayInfo method.
    2. Write Book class this will have instance variable and 2 Constructors. While creating
    an object make sure:
    Instance variables are being initialized Both Constructors are being executed.

   1. Напишите класс Student, который имеет переменные экземпляра имя и адрес.
    Создайте конструктор, который будет инициализировать эти переменные.
    Выведите имя и адрес заданного студента с помощью метода displayInfo.
    2. Напишите класс Book, который будет иметь переменную экземпляра и 2 конструктора. При создании
    объекта убедитесь, что:
    Переменные экземпляра инициализируются Оба конструктора выполняются.
     */
    String name;
    String address;
    Task4(String name){
        this.name=name;
        System.out.println("Constructor 1");
    }

    Task4(String name, String address){
        this(name);
        this.address=address;
        System.out.println("Constructor 2");
    }

}
