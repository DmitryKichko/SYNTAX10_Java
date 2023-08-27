package com.collection.class19;

public class Task1 {

    /*
    Напишите программу, в которой будут конструкторы: один с параметрами, а второй без параметров.
    Создайте отдельный класс Test, в котором будут выполняться оба конструктора один за одним.
     */

    String name;
    int age;
    double weight;


    Task1(String taskName, int age, double weight){

        name = taskName;
        this.age = age;
        this.weight = weight;
    }

    Task1() {
        name = "none";
        age = 0;
        weight = 0;
    }

    void printInfo(){
        System.out.println("Name: " + name + " Age: " + age + " Weight: " +weight);
    }

}
