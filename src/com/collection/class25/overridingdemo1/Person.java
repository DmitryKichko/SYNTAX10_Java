package com.collection.class25.overridingdemo1;

public class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("Person может есть");
    }

    void performDailyActivities() {
        System.out.println("есть и спать");
    }
}
    class Employee extends Person {

        Employee(String name) {
            super(name);
        }

        void performDailyActivities(){
            System.out.println("Офис работает каждый день и почта всю ночь");
        }
}

    class Student extends Person {
        Student(String name) {
            super(name);
        }

        void performDailyActivities() {
            System.out.println("Посещать занятия и заниматься по ночам");
        }
    }
     class Teacher extends Person {
         Teacher(String name) {
             super(name);
         }

         void performDailyActivities() {
             System.out.println("Проведение занятий по проверке заданий ");
         }
     }






