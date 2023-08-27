package com.collection.class16;

public class Task6 {

    public static void main(String[] args) {

        /*
        7. Как поменять местами две строки без временной переменной?
         */

        String str = "Строка 1";
        String str2 = "Строка 2";

        str = str+str2;

        str = str.substring(0, str.length()-str2.length());
        str=str.substring(str2.length());
        System.out.println(str);
        System.out.println(str2);
    }
}
