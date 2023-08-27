package com.company.class2422.task4;

import com.company.class2422.task3.Task3;

/*
3. Create 1 class with a private method that has 3 overloaded forms.
Then call each overloaded method with specific arguments and observe result.
3. Создайте 1 класс с приватным методом, который имеет 3 перегруженные формы.
Затем вызовите каждый перегруженный метод с определенными аргументами и наблюдайте результат.

 */
public class Task4 {
    private void sayHello() {
        System.out.println("Hello there");
    }

    private void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    private void sayHello(String name, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] args) {
        Task4 task4=new Task4();
        task4.sayHello("ksbfk",5);
    }
}
