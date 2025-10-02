package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

    public static void main(String[] args) {

        /*
         * С помощью сканера создать массив из целочисленных элементов;
         *
         * - затем вывести все элементы из массива
         */

        int[] array = {13};
        // array[1]=12;  - нельзя использовать одновременно с int[] array = {13};

        System.out.println(array.length);

        /*
         * С помощью сканера создать массив из целочисленных элементов;
         *
         * - затем вывести все элементы из массива
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько элементов нужно хранить в массиве");
        int size = scan.nextInt();

        int[] numbers = new int[size];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите значение, которое должно быть сохранено в индексе " + i);
            numbers[i] = scan.nextInt();
        }

        System.out.println("---------- ВЫВЕСТИ НА ЭКРАН ВСЕ ЭЛЕМЕНТЫ ИЗ МАССИВА ----------");

        for (int num : numbers) {
            System.out.println(num + " ");
        }


    }
}
