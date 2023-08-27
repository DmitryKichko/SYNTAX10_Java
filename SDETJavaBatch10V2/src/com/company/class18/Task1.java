package com.company.class18;

public class Task1 {
    /*
     1. Create a method that will accept an array as parameters and will return a sum of all
    elements from that array. Method should be visibly only within same package and accessible
    by the creating an instance of the class.

     1. Создайте метод, который будет принимать массив в качестве параметров и возвращать сумму всех
    элементов из этого массива. Метод должен быть видимым только в пределах одного пакета и доступным
    при создании экземпляра класса.
     */
    double sumArray(double [] array){
        double sum=0;
        for (double element:array
            ) {
            sum+=element;
        }
        return sum;

    }

}
