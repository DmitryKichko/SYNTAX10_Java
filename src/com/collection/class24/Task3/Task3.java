package com.collection.class24.Task3;

public class Task3 {

    private static void sayHello(){
        System.out.println("Hello there");
    }
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    static void sayHello(String name, int times){

        for (int i = 0; i < times; i++) {

            System.out.println("Hello "+name);
        }
    }

    public static void main(String[] args) {

       // Task3 task3 = new Task3(); // нам не нужно создавать объект так как это static методы

        Task3.sayHello();
        Task3.sayHello("Zarina");
        Task3.sayHello("Zarina", 5);
    }
}
