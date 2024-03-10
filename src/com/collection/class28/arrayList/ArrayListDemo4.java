package com.collection.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // недостаток такого создания объекта заключается в том что мы можем вызывать методы только те которые относятся к List
        list.add("Michael");
        list.add("Dmitry");
        list.add("Irina");
        list.add("Inna");

        System.out.println(list.size());   // позовляет узнать размер массива

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Mars");
        list1.add("Eugene");
        list1.add("Dilnoza");

        System.out.println(list);

       // list.addAll(list1);              // данный метод addAll() позволяет добавить весь список list1 в список list
        System.out.println(list);

       // list.addAll(1,list1);        // данный метод позволяет добавить весь список list1 в конретное место списка list (необходимо указать индекс куда вставлять)
        System.out.println(list);

        list.add(list1.get(0));       // позволяет вставить конкретнное значение списка list1 в список list

        System.out.println(list);

        list.add(1,list1.get(0)); // можем указать в какое место он должен быть добавлен
        System.out.println(list);
    }
}
