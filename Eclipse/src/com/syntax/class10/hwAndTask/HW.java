package com.syntax.class10.hwAndTask;

public class HW {

    public static void main(String[] args) {

        /*
         * Создайте массив (array) для хранения двойных значений
         *
         * - затем выведите их в обратном порядке
         */

        double[] numbers = {10.99, 15.1, 1.99, 23.99};

        for (int a = numbers.length - 1; a >= 0; a--) {
            System.out.println(numbers[a]);

        }

        /*
         * Создать массив на целых числах и вычислить сумму всех элементов в
         * массиве (array).
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
    }

}
