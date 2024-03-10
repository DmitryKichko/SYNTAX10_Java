package com.collection.class26.casting;

public class CastingDemo {


    public static void main(String[] args) {


        Object[] objects = {"GI", 10, 'A'};

        // 1-й способ

        Object obj = new String("blabla");

        String str = (String)obj;

        str.length();

        // 2-й способ

        System.out.println(((String)objects[0]).length());

        //3-й способ

       /* for (Object obj2 : objects) {

             if (obj2 instanceof String){

                 System.out.println(((String)obj2).length());

        }
        } */



    }
}
