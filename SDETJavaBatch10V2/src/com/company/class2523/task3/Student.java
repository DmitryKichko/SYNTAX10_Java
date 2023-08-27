package com.company.class2523.task3;

public class Student {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent,
    SchoolStudent.
    - Define common behavior within parent class and override some of the methods
    in child classes
    - Define some methods specific to child classes
    - Write example of achieving run time polymorphism

     Создайте класс Student, который будет иметь 3 подкласса SyntaxStudent, CollegeStudent,
    SchoolStudent.
    - Определите общее поведение в родительском классе и переопределите некоторые методы
    в дочерних классах
    - Определите некоторые методы, специфичные для дочерних классов
    - Напишите пример достижения полиморфизма во времени выполнения
     */
    void study(){
        System.out.println("Student must study");
    }
    void doHomeWork(){
        System.out.println("Student must do homeworks");
    }
    void practice(){
        System.out.println("Student must practice");
    }
}
class SyntaxStudent extends Student{
    void study(){
        System.out.println("Syntax Students must study hard to get kob quickly");
    }
    void doHomeWork(){
        System.out.println("Student must do programing homeworks");
    }
   void doResearch(){
       System.out.println("Syntax students must to research on google and watch youtube videos");
   }
}
class CollegeStudent extends Student{
    void doHomeWork(){
        System.out.println("College Student must do homeworks to get good grades");
    }
}

class SchoolStudent extends Student{

}