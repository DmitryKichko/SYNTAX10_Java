package com.company.class3129;

import java.util.*;

public class MapRecap {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Oxana");
        map.put(202, "John");
        map.put(177, "Jane");
        map.put(90, "Mike");
        map.put(90, "Abdul");
        map.put(null, null);
        map.put(null, "Elizabeth");

        System.out.println("---- HashMap ----");
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.isEmpty());
       // map.clear();
        System.out.println(map);
        System.out.println(map.isEmpty());

        Map<Integer, String> lmap = new LinkedHashMap<>();
        lmap.put(101, "Oxana");
        lmap.put(202, "John");
        lmap.put(177, null);
        lmap.put(90, "Mike");
        lmap.put(90, "Abdul");
        lmap.put(null, null);
        lmap.put(null, "Elizabeth");

        System.out.println("Linked HashMap");
        System.out.println(lmap);

        Map<Integer, String> tmap = new TreeMap<>();
        tmap.put(101, "Oxana");
        tmap.put(202, "John");
        tmap.put(177, null);
        tmap.put(90, "Mike");
        tmap.put(90, "Abdul");
       // tmap.put(null, null); // TreeMap не допускает нулевых ключей


        System.out.println("Tree Map");
        System.out.println(tmap);

        Map<Integer, String> htable = new Hashtable<>();
        htable.put(190, "Jack");
        // htable.put(null, "Me"); hashtable не позволяет иметь нулевые ключи и не нулевое значение

        System.out.println(htable);
        //получить доступ к 1 значению, указав ключ
        System.out.println(tmap.get(90));



    }
}
