package com.collection.class28.collectionsDemo1;

import java.util.Arrays;

public class Issues {

    public static void main(String[] args) {

        int num=10;
        System.out.println(num);
        num=20;
        System.out.println(num);

        int[] numArr = new int[3];

        numArr[0]=12;
        numArr[1]=120;
        numArr[2]=125;

        System.out.println("размер массива равен " + numArr.length);
       // numArr[3]=12;

        int[] newBiggerArr = new int[4];

        newBiggerArr[0]=numArr[0];
        newBiggerArr[1]=numArr[1];
        newBiggerArr[2]=numArr[2];
        newBiggerArr[3]=100;

        numArr=newBiggerArr;

        System.out.println(numArr[3]);
        System.out.println("размер переназначеного массива равен " + numArr.length);

        System.out.println(Arrays.toString(numArr));   //выводит значения которые мы храним в массиве

       // System.out.println(numArr); // если мы выведем просто numArr то он выводит нам место где хранится сам массив




    }
}
