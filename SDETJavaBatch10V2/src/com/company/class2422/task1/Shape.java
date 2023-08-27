package com.company.class2422.task1;

public class Shape {
    /*
    1. Write program: Shape class has a constructor that takes the
    radius and has a subclass as circle class.
    In circle class a method to calculate the area of circle.
    Test your code.


    1. Напишите программу: Класс Shape имеет конструктор, который принимает значение
    радиус и имеет подкласс в виде класса circle.
    В классе circle есть метод для вычисления площади круга.
    Протестируйте свой код.

     */
    double radius;
       Shape (double radius){
           this.radius=radius;
       }
}
class Circle extends Shape{
    Circle(double radius){
        super(radius);
    }
    void area(){
        System.out.println(Math.PI* Math.pow(radius,2));
    }

    public static void main(String[] args) {
        Circle circle=new Circle(10);
        circle.area();
    }
}
