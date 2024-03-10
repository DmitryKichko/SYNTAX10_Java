package com.collection.class26.casting;

public class Animal {

    void sleep(){
        System.out.println("Спит");
    }
    void eat(){
        System.out.println("Ест");
    }
}
class Dog extends Animal{
    @Override
    void eat(){
        System.out.println("Собака любит есть");
    }
}
class Cat extends Animal{
    void eat(){
        System.out.println("Молоко рыба");
    }
    void meow(){
        System.out.println("meow");
    }
}
