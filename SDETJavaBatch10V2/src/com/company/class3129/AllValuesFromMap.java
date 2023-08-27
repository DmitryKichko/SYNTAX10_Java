package com.company.class3129;

import javafx.print.Collation;
import java.util.Map.Entry;
import java.security.KeyStore;
import java.util.*;

public class AllValuesFromMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Oxana");
        map.put(202, "John");
        map.put(177, "Jane");
        map.put(90, "Mike");
        map.put(90, "Abdul");

        System.out.println(" ------------------   Getting all values   ------------------ ");
        Collection <String> val = map.values();

        for (String str:val){
            System.out.println(str);
        }

        System.out.println(" ------------------------- ");

        Iterator<String> it = val.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println(" ------------------   Getting all values   ------------------ ");

        Set<Integer> keys = map.keySet();

        for(int key:keys) {
            System.out.println(key +" ----- " + map.get(key));
        }

        Iterator<Integer> iter = keys.iterator();
        while(iter.hasNext()) {

            int k = iter.next();
            System.out.println(k + " -- " + map.get(iter.next()));

            //System.out.println(iter.next() + " ------- " + map.get(iter.next())); --> дает неправильный вывод
        }

        Set<Entry<Integer, String>> setEntr = map.entrySet();

        for (Entry entry:setEntr) {
            String var=entry.getKey()+ " "+entry.getValue();
            System.out.println(var);
        }
        System.out.println(" ------------------- ");
        Iterator<Entry<Integer, String>> it3 = setEntr.iterator();

        while(it3.hasNext()) {

            Entry<Integer, String> e = it3.next();
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
