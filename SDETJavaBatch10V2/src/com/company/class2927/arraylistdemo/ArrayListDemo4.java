package com.company.class2927.arraylistdemo;

import java.util.AbstractList;
import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        int [] [] numbers = new int[10][10] ;
            ArrayList<AbstractList<String>> arrayList = new ArrayList<>();

            ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add("Hello");

            arrayList.add(arrayList1);

    }
}
