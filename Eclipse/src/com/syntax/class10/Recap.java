package com.syntax.class10;

public class Recap {

    public static void main(String[] args) {

        String a[] = new String[2];
        System.out.println(a.length);

        for (String aa : a) {
            System.out.println(aa);
        }
        System.out.println("  ------------------------------------------------  ");

        String[] array = new String[3];
        array[0] = "Hello";
        array[1] = "Hi";

        //System.out.println(array[3]); ----->  Исключение выхода индекса массива за пределы границ (ArrayIndexOutOfBoundsException: 3
        System.out.println(array[2]); // получим: null

        int size = array.length;
        System.out.println(size);

        array[2] = "Как у тебя дела?";

        System.out.println(array[2]); // Как у тебя дела?

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "; ");
        }

        System.out.println("  ------------------------------------------------  ");

        for (String arr : array) {
            System.out.println(arr + "; ");
        }


    }

}
