package com.collection.class28.collectionsDemo1;

/*
        написать метод, который принимает в массив одно число, если число присутствует
        внутри этого массива удаляет его, как создать новый массив меньшего размера копирует элементы
        и вернуть его
         */

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 70, 10};
        int number = 10;
        System.out.println(Arrays.toString(remove(arr,number)));
    }

    public static int [] remove(int [] arr, int number){
        int counter=0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]==number){
                counter++;
            }
        }

        int[] newArr = new int[arr.length-counter];

        int counter2=0;

        for (int j : arr) {


            if (j != number) {
                newArr[counter2] = j;
                counter2++;
            }
        }
        return newArr;
    }
}
