package com.company.class18;

public class Task2 {
   /*
    2. Create a method that will take a String as a parameters and returns reversed String. Method
    should be available to all classes within your project and accessible by class name.

     2. Создайте метод, который будет принимать в качестве параметров строку и возвращать обратную строку. Метод
    должен быть доступен всем классам в вашем проекте и доступен по имени класса.
    */

    public static String reverse(String inputStr){
       // StringBuilder stringBuilder=new StringBuilder(inputStr);
       // stringBuilder.reverse();
       // stringBuilder.toString();
        return new StringBuilder(inputStr).reverse().toString(); // это то жк самое что на (13-15 строках) только короче

    }
}
