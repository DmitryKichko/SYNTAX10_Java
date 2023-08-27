package com.company.class2624.casting;

public class CastingDemo {

    public static void main(String[] args) {
        Object[] objects = {"Hi", 10, 'A'};
        executeALL(objects);



        /* for (Object obj:objects
             ) {
            if (obj instanceof String) {
                System.out.println(((String) obj).length());
            }
        } */
    }
        static void executeALL (Object[]arr){
            if (arr[0] instanceof String) {
                System.out.println("Yes it is a String ");
            }

            if (arr[1] instanceof String) {
                System.out.println("No it is a String ");
            }

        }
    }
