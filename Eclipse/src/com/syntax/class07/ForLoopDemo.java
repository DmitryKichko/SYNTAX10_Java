package com.syntax.class07;

public class ForLoopDemo {

    public static void main(String[] args) {

        /*
         * Я хочу сказать "привет" 5 раз
         */


        /*
         * for (инициализация; условие; инкремент/декремент) {
         * код, который будет повторяться
         * }
         *
         */

        for (int i = 1; i <= 5; i++) {
            System.out.println("Привет");
        }


        System.out.println("---------- ВЫВЕСТИ НА ПЕЧАТЬ ЧИСЛА ОТ 1 ДО 10 ----------");

        for (int i = 1; i <= 10; i++) {

            System.out.println(i);
        }


        System.out.println("---------- ВЫВЕСТИ НА ПЕЧАТЬ ЧИСЛА ОТ 20 ДО 10 ----------");

        for (int i = 20; i >= 10; i--) {
            System.out.println(i + " ");
        }


        System.out.println("---------- ВЫВЕСТИ НА ПЕЧАТЬ ЧИСЛА ОТ 10 ДО 100 (прибавляя на 2) ----------");

        for (int i = 10; i <= 100; i += 2) {
            System.out.println(i + " ");
        }


        System.out.println("---------- ВЫВЕСТИ НА ПЕЧАТЬ ЧЕТНЫЕ ЧИСЛА ОТ 10 ДО 100 ----------");

        for (int i = 10; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - чётное число");
            }
        }


        System.out.println("---------- ВЫВЕСТИ НА ПЕЧАТЬ ЧИСЛА ОТ 10 ДО 50 (прибавляя на 10) ----------");

        for (int i = 0; i <= 50; i += 10) {
                System.out.println(i);
        }


    }
}
