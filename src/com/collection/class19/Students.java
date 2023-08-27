package com.collection.class19;

public class Students {

    /*
    Напишите java-программу класса Students, которая принимает имя ученика и оценки по 3 предметам.
    Внутри класса также имеется метод для вычисления средней оценки.
    Протестируйте класс Student на 5 различных студентах с разными оценками.
    Ваша программа должна вывести средний балл каждого студента.
     */

    String name;
    double num1;
    double num2;
    double num3;


    void numPrintInfo(){

        double result = (num1+num2+num3)/3;

        System.out.println("Средний бал ученика: " + result);
    }

    Students(String name, double num1, double num2, double num3){

        this.name = name;
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;

    }
}
