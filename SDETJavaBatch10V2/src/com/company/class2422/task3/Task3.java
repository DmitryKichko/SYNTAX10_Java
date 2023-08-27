package com.company.class2422.task3;

/*
2. Create 1 class with a static method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
2. Создайте 1 класс со статическим методом, который имеет 3 перегруженные формы.
Затем вызовите каждый перегруженный метод с определенными аргументами и наблюдайте результат.

 */
public class Task3 {
    private static void sayHello(){
        System.out.println("Hello there");
    }
     static void sayHello(String name){
        System.out.println("Hello "+name);
    }
    static void sayHello(String name,int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello "+name);
        }
    }

    public static void main(String[] args) {
     sayHello("Zeynnep", 5);
    }
}
