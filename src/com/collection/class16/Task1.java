package com.collection.class16;

public class Task1 {
    public static void main(String[] args) {
        /*
 1. Создайте строку String, в которой будет храниться предложение.
 Напишите программу для получения новой строки String без пробелов.
 4. Как бы вы изменили строку на противоположную посимвольно?
         */

        // 1-е задание
        String str = "Это предложение состоит из пробелов";
        System.out.println(str.replaceAll(" ", "")); // 1-й способ
        System.out.println(str.replaceAll("\\s", "")); // 2-й способ
        System.out.println(str.replace(" ", "")); // 3-й способ






    }
}
