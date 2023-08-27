package com.collection.class18;

public class Task3 {

    /*
    Создайте метод, который будет принимать в качестве параметра
    строку String и возвращать новую строку, состоящую только из гласных букв.
    Метод должен быть доступен только внутри класса, в котором он был объявлен,
    и выполняться путем вызова его имени
     */

    private static String onlyVowels(String inputStr) {
        return inputStr.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels(" abcjkksndinoerUt"));
    }

}
