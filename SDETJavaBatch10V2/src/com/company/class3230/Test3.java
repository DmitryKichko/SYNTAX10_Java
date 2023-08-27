package com.company.class3230;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.util.ArrayList;

public class Test3 {

    public static void main(String[] args) {
       /*
       Create a collection of integer in which you can keep duplicates.

       Write a logic to find sum of all integers

        Создайте коллекцию целых чисел, в которой можно хранить дубликаты.

       Напишите логику для нахождения суммы всех целых чисел
        */
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(10);

        int sum = 0;
        for (Integer number : arrayList
             ) {
            sum = sum + number;
        }
        System.out.println(sum);
    }

}
