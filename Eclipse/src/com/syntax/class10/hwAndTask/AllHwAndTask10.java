package com.syntax.class10.hwAndTask;

import java.util.Scanner;

public class AllHwAndTask10 {

    public static void main(String[] args) {

        /**
         * Создайте массив для хранения двойных значений
         *
         * - затем выведите их в обратном порядке
         */

        double[] numbers = {10.99, 15.1, 1.99, 23.99};

        for (int a = numbers.length - 1; a >= 0; a--) {
            System.out.println(numbers[a]);

        }

        /**
         * Создать массив на целых числах и вычислить сумму всех элементов в массиве (array).
         */

        int[] arr = {2, 88, 74, 1, 96};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Всего = " + sum);

        System.out.println("---------- СУММИРОВАНИЕ С ПОМОЩЬЮ УСОВЕРШЕНСТВОВАННОГО ЦИКЛА FOR ----------");

        sum = 0;

        for (int num : arr) {

            sum += num;
        }
        System.out.println("Всего = " + sum);

        /**
         *  Из массива элементов найти наибольшее число.
         */

        int[] num = {1000, 20, 100, 50, 222};
        int largest = num[0];

        for (int i = 0; i < num.length; i++) {

            if (num[i] > largest) {
                largest = num[i];
            }
        }

        System.out.println(largest);

        System.out.println("---------- С ПОМОЩЬЮ УСОВЕРШЕНСТВОВАННОГО ЦИКЛА FOR ----------");

        largest = num[0];

        for (int n : num) {

            if (n > largest) {
                largest = n;
            }
        }

        System.out.println(largest);

        /**
         * С помощью сканера создать массив из целочисленных элементов;
         *
         * - затем вывести все элементы из массива
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько элементов нужно хранить в массиве");
        int size = scan.nextInt();

        int[] numbers1 = new int[size];

        for (int i = 0; i < numbers1.length; i++) {
            System.out.println("Введите значение, которое должно быть сохранено в индексе " + i);
            numbers1[i] = scan.nextInt();
        }

        System.out.println("---------- ВЫВЕСТИ НА ЭКРАН ВСЕ ЭЛЕМЕНТЫ ИЗ МАССИВА ----------");

        for (int num1 : numbers1) {
            System.out.println(num1 + " ");
        }

        /**
         * Создать массив двойных значений (double) с помощью сканера.
         *
         * - затем вычислить сумму всех хранящихся в этом массиве элементов.
         */

        Scanner scan1;
        double[] array;
        double sum1 = 0.0;

        scan1 = new Scanner(System.in);
        System.out.println("Сколько элементов нужно хранить в массиве");
        int size2 = scan.nextInt();

        array = new double[size2];

        for (int i = 0; i < size2; i++) {

            array[i] = scan1.nextDouble();
            sum1 += array[i];
        }

        System.out.println("Всего: " + sum1);


        /**
         * Создать массив стран.
         *
         * При извлечении всех значений из массива выведите капитал для каждой страны.
         * (используйте 2 разных цикла)
         */

        String[] countries = {"Афганистан", "Таджикистан", "США", "Япония"};

        String capital = "";

        for (String country : countries) {

            if (country.equals("Афганистан")) {
                capital = "Кабул";
            } else if (country.equals("Таджикистан")) {
                capital = "Душанбе";
            } else if (country.equals("США")) {
                capital = "Вашингтон";
            } else if (country.equals("Япония")) {
                capital = "Токио";
            }
            System.out.println("Страна " + country + " это " + capital);
        }

        System.out.println("---------- С ПОМОЩЬЮ SWITCH ----------");

        capital = "";

        for (int i = 0; i < countries.length; i++) {

            switch (countries[i]) {

                case "Афганистан":
                    capital = "Кабул";
                    break;
                case "Таджикистан":
                    capital = "Душанбе";
                    break;
                case "США":
                    capital = "DC";
                    break;
                case "Япония":
                    capital = "Токио";
                    break;

            }
            System.out.println("Страна " + countries[i] + " это " + capital);
        }


        /**
         *  Создайте 2D (двумерный) массив:
         *
         * - в котором будут храниться следующие значения:
         *
         *   Mr, Mrs, Ms, Miss
         *  и Smith, Jordan, Jackson, Obama.
         *
         *  После хранения значений напечатайте следующее:
         *
         *  Миссис Смит, мистер Обама, мисс Джексон, мисс Джордан.
         */

        String[][] arrName = {
                {"Mr", "Mrs", "Ms", "Miss"},
                {"Smith", "Jordan", "Jackson", "Obama"}
        };

        System.out.println(arrName[0][1] + " " + arrName[1][0]);
        System.out.println(arrName[0][0] + " " + arrName[1][3]);
        System.out.println(arrName[0][2] + " " + arrName[1][2]);
        System.out.println(arrName[0][3] + " " + arrName[1][1]);


        System.out.println("-------------------- Способ через цикл: for ------------------------");


        for (int r = 0; r < arrName.length; r++) {            // Внешний цикл выполняет итерацию по строкам

            for (int c = 0; c < arrName[r].length; c++) {    // Внутренний цикл выполняет итерацию по столбцам

                System.out.println(arrName[r][c] + " ");

            }

        }

        System.out.println("-------------------- Способ через цикл: for each ------------------------");

        for (String[] arr1 : arrName) {

            for (String arr2 : arr1) {

                System.out.print(" " + arr2);
            }
        }




    }
}
