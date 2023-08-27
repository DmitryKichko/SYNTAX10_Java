package com.company.class3230;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Task2 {
    /*
    2. Crate a map of countries with its capital that will store countries in alphabetical order.
    Print all key and values from a country map using for each loop and iterator.
    Print all values from a contry map using for loop and iterator.

    2. Создайте карту стран со столицей, которая будет хранить страны в алфавитном порядке.
    Выведите все ключи и значения из карты стран с помощью цикла for each и итератора.
    Выведите все значения из карты стран, используя цикл for и итератор.
     */
    public static void main(String[] args) {
        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Ukraine", "Kyiv");
        countries.put("Italy", "Rome");
        countries.put("Costa Rica", "San Jose");
        countries.put("Argentina", "Buenos Aires");
        countries.put("Colombia", "Bogota");
        countries.put("Mexico", "Mexico City");
        countries.put("New Zealand", "Wellington");


        // только получение ключей
        for (String key: countries.keySet()
        ) {
            System.out.println(key);
            /*if(key.length()>2){
                countries.remove(key); не рекомендую
            }*/
        }
        Iterator<String> iterator = countries.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            if(key.length()>5){
              //  iterator.remove();
            }
        }
        System.out.println(countries);

        // получение только значений
        for (String value:countries.values()
        ) {
            System.out.println(value);
        }

        Iterator<String> iterator2 = countries.values().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            if(key.length()>5){
                // iterator.remove():
            }
        }


        System.out.println("=========================================================");

        Iterator<Map.Entry<String, String>> iterator1 = countries.entrySet().iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> next = iterator1.next();
            String key = next.getKey();
            String value = next.getValue();
            System.out.println(key+ " "+ value);
        }




    }
}
