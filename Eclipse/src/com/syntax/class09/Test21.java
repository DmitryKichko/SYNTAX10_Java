package com.syntax.class09;

public class Test21 {

    public static void main(String[] args) {


        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};

        // System.out.println(grades.length);

        int size = grades.length;
        System.out.println(size);

        System.out.println(grades[1]);

        int i = 0;

        System.out.println(grades[i]);

        i++;
        System.out.println(grades[i]);

        /*
         * ЗАДАЧА:
         * Создать массив автомобилей и записать в него 6 элементов.
         * Выведите все значения из массива.
         */

        for (int j = 0; j < size; j++) {
            System.out.println(grades[j]);
        }


        String[] names = {"Jose", "Sule", "Blake", "Ana", "Enes", "Andrei", "Burju", "Gurkan"};

        for (int b = 0; b < names.length; b++) {

            System.out.println(names[b]);
        }

        /*
         * ЗАДАЧА:
         * Создать массив автомобилей и записать в него 6 элементов.
         * Выведите все значения из массива.
         */

        String[] cars = {"BMW", "Audi", "Subaru", "KIA", "Hundai", "Toyta"};

        for (int a = 0; a < cars.length; a++) {
            System.out.println(cars[a]);

        }

        System.out.println("-------------------------------------------------------");

        for (String car : cars) {

            System.out.println(car);
        }

        System.out.println("-------------------------------------------------------");

        int[] numbers = {100, 20, 30, 67, 35, 90, 24};

        for (int number : numbers) {

            System.out.println(number);
        }

        char[] grads = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        for (char grad : grads) {
            System.out.println(grad);

        }

        System.out.println(" --------------------- Я хочу выводить значения в обратном порядке ----------------------------");

        char[] grada = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};

        for (int c = grada.length - 1; c >= 0; c--) {

            System.out.print(grada[c] + " ");

        }

    }
}
