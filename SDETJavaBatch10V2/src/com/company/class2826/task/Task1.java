package com.company.class2826.task;

import java.util.ArrayList;

public class Task1 {
    /*
    1. Create an ArrayList that will store 5 names into it.
    2. Find out whether the given ArrayList is empty or not?
    3. Check whether the specific name is present in an ArrayList or not?
    4. Find the size of your arrayList and print all values from that.
    1. Создайте список ArrayList, в котором будет храниться 5 имен.
    2. Определите, пуст ли данный список ArrayList или нет?
    3. Проверьте, присутствует ли конкретное имя в списке ArrayList или нет?
    4. Найдите размер вашего массива arrayList и выведите все значения из него.
     */

    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        name.add("Mars");
        name.add("Andrei");
        name.add("Hilal");
        name.add("Abdul");
        name.add("Oxana");
        System.out.println(name);
        System.out.println(name.isEmpty()); // 2. task
        System.out.println(name.contains("Sule")); // 3. task
        System.out.println(name.contains("Abdul")); // 3. task
        System.out.println(name.size()); // 4. task
        System.out.println(name);
    }
}
