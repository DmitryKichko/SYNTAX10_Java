package com.collection.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Michael");
        list.add("Dmitry");
        list.add("Irina");
        list.add("Inna");
        list.add("Dmitry");
        list.add("Dmitry");
        System.out.println(list);
        System.out.println(list.remove("Dmitry")); // удаляет элемент который мы указываем и возвращает boolean значение true если это значение есть в массиве
        System.out.println(list);

        while (list.remove("Dmitry")){              // используется для удаления всех Dmitry
        }
        System.out.println(list);

        /* for (int i = 0; i < list.size(); i++) {          // тоже самое но его не рекомендуется использовать лучше использовать while

            if (list.get(i).equals("Dmitry")){
                list.remove(i);
            }
        } */
        System.out.println(list.remove("Obama"));
    }

}
