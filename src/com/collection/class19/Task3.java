package com.collection.class19;

public class Task3 {

    /*
    Напишите программу, которая будет иметь 4 различных уровня доступа к конструкторам
    конструкторов и создать 3 объекта этого класса:
    1 - внутри того же класса;
    2 - извне класса;
    3 - из другого класса в другом пакете и пронаблюдать результат.
     */

    private Task3(){

    }

    Task3(String name){

    }

    protected Task3(int age){

    }

    public Task3(boolean IsRaining){

    }


    public static void main(String[] args) {

        Task3 task1 = new Task3();
        Task3 task2 = new Task3("blabla");
        Task3 task3 = new Task3(21);
        Task3 task4 = new Task3(false);

    }
}
