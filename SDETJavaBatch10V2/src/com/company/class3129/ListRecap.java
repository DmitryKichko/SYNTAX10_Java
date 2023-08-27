package com.company.class3129;

import java.util.ArrayList;
import java.util.List;

public class ListRecap {
    public static void main(String[] args) {
        List<String> grocery = new ArrayList<>();
        grocery.add("Milk");
        grocery.add("Cheese");
        grocery.add("Eggs");
        grocery.add("Butter");

        System.out.println(" Getting all elements ---------- ");

        for(String gros: grocery) {
            System.out.println(gros);
        }
    }
}
