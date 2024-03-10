package com.collection.class28.arrayList;

import java.util.ArrayList;

public class ArrayListDemo2 {


    public static void main(String[] args) {

        ArrayList<Object> arrayList = new ArrayList<>();  // можно и такими универсальными способами, но они не рекомендуются, они могут создать проблемы во время выполнения
                                                          // так как мы храним несколько типов данных
        arrayList.add(10);
        arrayList.add("jam");
        arrayList.add('!');

        ArrayList arrayList1 = new ArrayList();
        arrayList1.add(10);
        arrayList1.add("lsfdkkgk");

    }
}
