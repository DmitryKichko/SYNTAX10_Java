package com.collection.class28.arrayList;

import java.util.ArrayList;

public class ArrayListDemo8 {

    public static void main(String[] args) {

        ArrayList<String> subjects = new ArrayList<>();
        subjects.add("SDLS");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("Git");
        subjects.add("Selenium");
        subjects.add("TestNG");

        subjects.remove(0);  // мы можем удалить по индексу
        subjects.remove("Git"); // либо можем удалить по значению

        System.out.println(subjects);

      /*  for (String subject: subjects) {          // вот по этому мы не можем использовать for для удаления так как наш массив динамический и возникнет ошибка
            if (subject.length()>4){
                subjects.remove(subject);
            }
        } */
    }
}
