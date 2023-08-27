package com.collection.class18;

public class Task2 {

    /*
    Создайте метод, принимающий в качестве параметра строку и возвращающий обратно строку.
    Метод должен быть доступен всем классам проекта по имени класса.
     */

   public String reverse (String inputStr) {

      /* StringBuilder stringBuilder = new StringBuilder();
       stringBuilder.reverse();
       stringBuilder.toString(); */
      return new StringBuilder(inputStr).reverse().toString(); // это тоже самое только короче


    }
}
