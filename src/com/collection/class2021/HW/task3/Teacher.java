package com.collection.class2021.HW.task3;

public class Teacher {

    /*
    3. Напишите программу на языке Java под названием Teacher.
       Определите особенности и поведение этого класса.
       Создайте 3 подкласса MathTeacher, ChemistryTeacher и PianoTeacher,
       которые будут иметь свои особенности и поведение. Протестируйте все 4 класса
     */

    static String school = "Syntax";
    String name;
    int age;
    String book;
    double salary;
    void teach(){
        System.out.println(name + "учитель" + book);
    }
}
