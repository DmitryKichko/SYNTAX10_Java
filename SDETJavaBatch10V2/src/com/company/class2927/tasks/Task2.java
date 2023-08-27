package com.company.class2927.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
    /*
    HW:
    2. Create an arrayList of words. Remove every
word that ends with "e".
=======================================================
    2. Создайте массивСписок слов. Удалите каждое
слово, которое заканчивается на "е".
     */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("10");
        words.add("nine");
        words.add("great");
        words.add("like");
        words.add("hike");
        Iterator<String> iterator = words.iterator();
        // words.removeIf(word -> word.endsWith("e") || word.endsWith("E"));

        while (iterator.hasNext()){
            String word = iterator.next();
            if(word.endsWith("e")||word.endsWith("E")){
                iterator.remove();
            }
        }
        System.out.println(words);
    }
}
