package com.collection.class28.arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo9 {

    public static void main(String[] args) {
        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLS");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");

        for (int i = 0; i < subjects.size(); i++) {
            if (subjects.get(i).length()>4){
                subjects.remove(i);
            }
        }
        System.out.println(subjects);
    }
}
