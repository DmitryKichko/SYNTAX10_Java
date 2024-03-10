package com.collection.class28.Task;

import java.util.ArrayList;

public class Task1 {
/*
Создайте список ArrayList, в котором будет храниться 5 имен
 */
    public static void main(String[] args) {

        ArrayList<String> name= new ArrayList<>();
        name.add("Mars");
        name.add("Andrei");
        name.add("Hilal");
        name.add("Abdul");
        name.add("Oxana");
        System.out.println(name);
        System.out.println(name.isEmpty());
        System.out.println(name.contains("Sule")); // проверяет есть ли такое имя в списке
        System.out.println(name.contains("Abdul")); // проверяет есть ли такое имя в списке
        System.out.println(name.size());
        name.remove(3);            // удаление записи по индексу
        System.out.println(name);
        name.remove("Oxana");         // удаление по значению
        System.out.println(name);
    }
}
