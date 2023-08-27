package com.company.class2927.tasks;

import java.util.ArrayList;

public class Task3 {
    /*
    HW:
3. Create an arrayList of drinks. If any drink has
letter "a" or "e" replace it with water.
=======================================================================
3. Создайте массивСписок напитков. Если в каком-либо напитке есть
буква "а" или "е", замените его на воду.
     */
    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Fanta");
        drinks.add("Coke");
        drinks.add("Wine");
        drinks.add("Rum");
        drinks.add("Tequila");
        System.out.println(drinks);
        for (int i = 0; i < drinks.size(); i++) {

            if (drinks.get(i).contains("e") || drinks.get(i).contains("a")){
             drinks.set(i,"Water");
            }
        }
        System.out.println(drinks);
    }
}
