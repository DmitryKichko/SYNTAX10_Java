package com.collection.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo5 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // недостаток такого создания объекта заключается в том что мы можем вызывать методы только те которые относятся к List
        list.add("Michael");
        list.add("Dmitry");
        list.add("Irina");
        list.add("Inna");

        for (String name:list
             ) {
            System.out.println(name);

        }

        System.out.println("=============================");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

        }
    }
}
