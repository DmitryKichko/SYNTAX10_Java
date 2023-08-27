package com.company.class2826.collectionsDemo1;

import java.util.Arrays;

public class Issues {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(num);
        num=20; // предыдущее значение перезаписано
        System.out.println(num);
        int[] numArr = new int [1000000]; // сначала нужно определить размер
        numArr[0]=12;
        numArr[1]=120;
        numArr[2]=125;
        System.out.println("Size of the arr before increase "+numArr.length);
        // numArr[3]=12;
        int [] newBiggerArr = new int[4];
        newBiggerArr[0]=numArr[0];
        newBiggerArr[1]=numArr[1];
        newBiggerArr[2]=numArr[2];
        newBiggerArr[3]=100;
        numArr=newBiggerArr;
        System.out.println(numArr[3]);
        System.out.println("Size of the arr after increase "+numArr.length);

        System.out.println(numArr);
        System.out.println(Arrays.toString(numArr));

        /* Напишите метод, который принимает массив и число, если число присутствует
        внутри этого массива удалить его, как создать новый массив меньшего размера,
        скопировать элементы и вернуть его. */
    }
}
