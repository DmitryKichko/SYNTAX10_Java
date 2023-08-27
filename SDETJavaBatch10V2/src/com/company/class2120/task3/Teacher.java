package com.company.class2120.task3;

public class Teacher {
    /*
    3. Write a Java program called Teacher.
    Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher,
    ChemistryTeacher and PianoTeacher that would
    have it their own features and behaviour.
    Test all 4 classes

    3. Напишите программу на Java под названием Teacher.
    Определите особенности и поведение этого класса.
    Создайте 3 подкласса MathTeacher,
    ChemistryTeacher и PianoTeacher, которые будут иметь
    иметь свои особенности и поведение.
    Протестируйте все 4 класса
     */
    static String school="Syntax";
    String name;
    int age;
    String books;
    double salary;
    void teach(){
        System.out.println(name+" teaches "+books);
    }
}
