package com.collection.class16;

public class Task4 {

    public static void main(String[] args) {

        /*
        5. Как развернуть строку слово за словом?
         */

        String str = "Это предложение которое я хочу перевернуть";
        String[] arr = str.split(" ");
        System.out.println(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            StringBuilder stringBuilder = new StringBuilder(arr[i]);
            stringBuilder.reverse();
            arr[i] = stringBuilder.toString();
        }
        System.out.println(arr[0]);

    }
}
