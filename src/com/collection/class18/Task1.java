package com.collection.class18;

public class Task1 {

    /*
    Создать метод, который будет принимать в качестве параметров массив
    и будет возвращать сумму всех элементов этого массива.
    Метод должен быть виден только в пределах одного пакета и
    доступен при создании экземпляра класса.
     */

     double sumArray(double [] array){
         double sum=0;

         for (double element : array) {

             sum+=element;

         }

         return sum;

        }
    }




