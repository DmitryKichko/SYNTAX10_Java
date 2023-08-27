package com.company.class2927.tasks;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {
    /*
    HW:
1. Create an arraylist of cars and retrieve all the
value using 3 different ways.

2. Create an arrayList of words. Remove every
word that ends with "e".

3. Create an arrayList of drinks. If any drink has
letter "a" or "e" replace it with water.

4. Create an arrayList of even numbers from 1
to 50. Remove any number that is divisible
by 5 from that arrayList.
=======================================================================
1. Создайте массив автомобилей и извлеките из него все
значения, используя 3 различных способа.

2. Создайте массивСписок слов. Удалите каждое
слово, которое заканчивается на "е".

3. Создайте массивСписок напитков. Если в каком-либо напитке есть
буква "а" или "е", замените его на воду.

4. Создайте массивСписок четных чисел от 1
до 50. Удалите из этого списка любое число, кратное
на 5 из этого списка.
     */
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW M3");
        cars.add("Honda Civic");
        cars.add("Toyota CHR");
        cars.add("hyundai tucson");
        cars.add("Lucid");
        System.out.println("==========================");
        // при обращении только к элементам всегда используйте расширенный цикл for
        for (String car:cars
             ) {
            System.out.println(car);
        }
        System.out.println("==========================");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(1));
        }
        System.out.println("==========================");
        Iterator<String> iterator = cars.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
