package com.collection.class16;

public class Task2 {

    public static void main(String[] args) {

        // раставить код попорядку CMD+ALT+L - для mac

        /*
    2. Создайте Строку, которая должна состоять из букв, цифр и специальных символов.
    Определить количество буквенных символов.
     */

        String str = "ajfaASDKJNKJ1234!@#$%^&";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());
        //.length() - это метод из класса String, поэтому нам необходимо ()



    }
}
