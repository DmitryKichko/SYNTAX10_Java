package com.syntax.class09;

public class RetrievingAll {

    public static void main(String[] args) {


        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int size = grades.length; // дает размер --> сколько элементов в данном массиве
        // (вернет количество элементов в массиве)

        System.out.println(size);
        //System.out.println(grades.length); - либо мы можем использовать этот вариант
        System.out.println(grades[1]);

//----------------------------------------------------------------------------------------------------------------------

        int i = 0;

        System.out.println(grades[i]); // 'A'

        i++;

        System.out.println(grades[i]); // 'B'

//----------------------------------------------------------------------------------------------------------------------

        System.out.println("---------------------- ПОЛУЧЕНИЕ ВСЕХ ЗНАЧЕНИЙ С ПОМОЩЬЮ ЦИКЛА FOR ----------------------");

        for (int j = 0; j < size; j++) {
            System.out.println(grades[j]);
        }

        System.out.println("-----------------------------------------------------------------------------------------");

        String[] names = {"Jose", "Sule", "Blake", "Ana", "Enes", "Andrei", "Burju", "Gurkan", "Imam"};

        for (int a = 0; a < names.length; a++) {

            System.out.println(names[a]);

        }

//----------------------------------------------------------------------------------------------------------------------

        /*
         * ЗАДАЧА:
         * - Создать массив автомобилей и записать в него 6 элементов.
         * - Вывести все значения из массива.
         */


        System.out.println("---------------------- АВТОМОБИЛЬНЫЙ МАССИВ ----------------------");

        String[] cars = {"Corolla", "Tesla", "Checy", "Honda", "MItsubishi", "Xpeng", "Nio", "Kia"};

        for (int b = 0; b < cars.length; b++) {

            System.out.println(cars[b]);
        }

//----------------------------------------------------------------------------------------------------------------------

        System.out.println("----------- РАСШИРЕННЫЙ ЦИКЛ - FOR / УЛУЧШЕННЫЙ ЦИКЛ - FOR / ЦИКЛ - for each  -----------");

        for (String car : cars) {

            System.out.println(car);
        }

//----------------------------------------------------------------------------------------------------------------------

        System.out.println("---------------------- МАССИВ ЧИСЕЛ ----------------------");

        int[] numbers = {100, 20, 67, 45, 90, 23};

        for (int c = 0; c < numbers.length; c++) {

            System.out.println(numbers[c]);

        }
    }

}
