package com.company.class19;

public class Task3 {
    /*
   1. Write a program that will have 4 different access levels of constructors and create 3
    object of this class: 1 - inside same class; 2 - from outside the class; 3 - from
    different class inside different package and observe result.

    1. Напишите программу, которая будет иметь 4 различных уровня доступа к конструкторам и создавать 3
    объекта этого класса: 1 - внутри того же класса; 2 - вне класса; 3 - из
    другого класса в другом пакете и пронаблюдайте результат.

    2. Write program that have static constructor and observe result.
    2. Напишите программу, имеющую статический конструктор, и понаблюдайте за результатом.
     */

    private Task3(){

    }
    Task3(String name){

    }
    protected Task3(int age){

    }
    public Task3(boolean Israining){

    }

    public static void main(String[] args) {
        Task3 task1=new Task3();
        Task3 task2=new Task3("blablabla");
        Task3 task3=new Task3(15);
        Task3 task4=new Task3(false);
    }

}
