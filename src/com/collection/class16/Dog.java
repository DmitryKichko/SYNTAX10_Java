package com.collection.class16;

public class Dog {
    String name; // переменная экземпляра
    static String Bread; // статическая переменная
    String color;

    void bark() {
        int times = 10;  // локальная переменная
        for (int i = 0; i < times; i++) {
            System.out.println("собака лает");
        }
    }
}
