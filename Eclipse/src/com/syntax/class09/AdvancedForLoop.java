package com.syntax.class09;

public class AdvancedForLoop {

    public static void main(String[] args) {

        System.out.println("---------------------------- МАССИВ ARRAY --------------------------------");

        String[] cars = {"Corolla", "Tesla", "Checy", "Honda", "Mitsubishi", "Xpeng", "Nio", "Kia"};

        for (int b = 0; b < cars.length; b++) {

            System.out.println(cars[b]);
        }

        System.out.println("--------- РАСШИРЕННЫЙ ЦИКЛ - FOR / УЛУЧШЕННЫЙ ЦИКЛ - FOR / ЦИКЛ - for each  ---------");

        for (String car : cars) {

            System.out.println(car);
        }

        System.out.println("---------------------------- МАССИВ (ARRAY) ЧИСЕЛ ----------------------------");

        int[] numbers = {100, 20, 67, 45, 90, 23};

        for (int i = 0; i < numbers.length; i++) {

        }

        System.out.println("--------- РАСШИРЕННЫЙ ЦИКЛ - FOR / УЛУЧШЕННЫЙ ЦИКЛ - FOR / ЦИКЛ - for each  ---------");

        for (int num : numbers) {

            System.out.println(num);
        }

        System.out.println("---------------------------- МАССИВ (ARRAY) CHAR  ----------------------------");

        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        for (char grade : grades) {

            System.out.print(grade + " ");
        }

        System.out.println(" Я хочу выводить значения в обратном порядке !!!!!");

        for (int i = grades.length - 1; i >= 0; i--) {

            System.out.print(grades[i] + " ");
        }


    }
}
