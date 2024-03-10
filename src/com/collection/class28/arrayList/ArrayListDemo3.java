package com.collection.class28.arrayList;

import java.util.ArrayList;

public class ArrayListDemo3 {


    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hialh");
        arrayList.add("Eli");
        arrayList.add("Jam");
        arrayList.add("Jam");
        arrayList.add("Eli");
        arrayList.add("Tes");
        System.out.println(arrayList);
        arrayList.remove("Eli");  // remove используется для удаления элемента или для удаления дубликатов элементов
        System.out.println(arrayList);


        arrayList.add(2,"Serge"); // используется для вставки элемента в список
        System.out.println(arrayList);

        // removeAll используется для удаления всего
        arrayList.removeAll(arrayList);
        System.out.println(arrayList);


    }
}
