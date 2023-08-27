package com.company.class3028;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) {
        Map<Integer, String> student = new HashMap<>();
        student.put(1, "Maria");
        student.put(2, "Jemil");
        student.put(3, "Sherif");
        student.put(4, "Ana");
        student.put(5, "Olena");

        Collection<String> values = student.values();
        for(String students : values){
            System.out.println(students);
        }

        Set<Integer> keys = student.keySet();
        for(Integer key:keys){
            System.out.println(key);
        }
    }
}
