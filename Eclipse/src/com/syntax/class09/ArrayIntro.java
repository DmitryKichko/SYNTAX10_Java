package com.syntax.class09;

public class ArrayIntro {

    public static void main(String[] args) {

        int num = 10;

        int[] arr = new int[5];

        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        System.out.println(arr[2] + arr[0]); // 40

        // Я хочу хранить дни недели

        String[] days = new String[7];
        days[0] = "Понедельник";
        days[1] = "Вторник";
        days[2] = "Среда";
        days[3] = "Четверг";
        days[4] = "Пятница";
        days[5] = "Суббота";
        days[6] = "Воскресенье";

        System.out.println(days[5] + " " + days[6]);

        days[6] = "10";

        System.out.println(days[5] + " " + days[6]);

        boolean[] array = new boolean[3];
        array[0] = true;
        array[1] = true;
        array[2] = false;

        System.out.println(array[1]);

        if (array[1]) {
            System.out.println("Значение верно (True): " + array[1]);

        }
    }

}
