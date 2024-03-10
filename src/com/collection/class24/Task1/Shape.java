package com.collection.class24.Task1;


/*
Напишите программу:
Класс Shape имеет конструктор, принимающий радиус, и имеет подкласс в виде класса circle.
В классе circle создайте метод для вычисления площади круга.
Протестируйте свой код.
 */
public class Shape {

    double radius;

    Shape(double radius) {
        this.radius = radius;
    }
}
    class Circle extends Shape{


        Circle (double radius){
            super(radius);
        }

        void area(){
            System.out.println(Math.PI*Math.pow(radius,2));
        }

        public static void main(String[] args) {

            Circle circle = new Circle(10);
            circle.area();
        }


    }

