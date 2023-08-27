package com.company.class3129;

import java.util.*;

public class Recap {

    public static void main(String[] args) {
        List<String> groceries = new LinkedList<>();
        groceries.add("Milk");
        groceries.add("Cheese");
        groceries.add("Eggs");
        groceries.add("Butter");
        groceries.add("Butter");

        System.out.println(groceries.size());

        System.out.println(groceries);

        System.out.println("******************* Getting all elements *******************");

        for (String gros: groceries) {
            System.out.println(gros);
        }

        System.out.println("******************* Getting all elements *******************");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println(groceries.get(i));
        }

        System.out.println("******************* Getting all elements *******************");
        Iterator<String> iterator = groceries.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Set<String> car = new TreeSet<>();
        car.add("BMW");
        car.add("Kia");
        car.add("Toyota");
        car.add("Honda");
        car.add("BMW");

        System.out.println(car.size());
        System.out.println(car);

        Iterator<String> it = car.iterator();
        String c = it.next();
        System.out.println("**************************");
        System.out.println(c);
        System.out.println("**************************");

        String cc = car.iterator().next();
        System.out.println(cc);

        System.out.println(" elements from set to list ");

        List<String> carCopy = new ArrayList<>(car);
        System.out.println(carCopy);
        System.out.println(carCopy.get(2));

        List<String> carCopy2 = new ArrayList<>();
        carCopy2.addAll(car);
        System.out.println(carCopy2);
        System.out.println(carCopy2.get(2));

        System.out.println("**************************");
        System.out.println(carCopy2);
        carCopy2.add("Honda");
        carCopy2.add("Honda");
        carCopy2.add("Toyota");

        System.out.println(carCopy2);
        // how would you remove duplicate elements from the list

        Set<String> myCars = new LinkedHashSet<>();
        myCars.addAll(carCopy2);
        System.out.println(myCars);
    }
}
