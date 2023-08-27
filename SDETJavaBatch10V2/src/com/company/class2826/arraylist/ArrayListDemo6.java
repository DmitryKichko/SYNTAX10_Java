package com.company.class2826.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Andrei");
        list.add("Michael");
        list.add("Andrei");
        list.add("Sule");
        list.add("Abdul");
        list.add("Andrei");
        System.out.println(list);
        System.out.println(list.remove("Andrei"));

        ArrayList<String> name = new ArrayList<>();
        name.add("Andrei");
        list.removeAll(name);

       /* while (list.remove("Andrei")){

// рекомендуется удалить все записи
        }*/
        /*for (int i = 0; i <list.size(); i++) {
            if(list.get(i).equals("Andrei")){
                list.remove(i);
            }
        }*/
        // тоже самое что и с while
       // System.out.println(list);

        System.out.println(list);
    }
}
