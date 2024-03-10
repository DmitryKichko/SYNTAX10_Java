package com.collection.classTesting;

public class test2 {

    /*
    Написать JAVA-программу для проверки того, является ли данное число простым или нет.
     */

    public static void main(String[] args) {

        int given = 10;
        boolean isPrime = true;

        if(given>1){
            for (int i = 2; i <given ; i++) {

                if (given%i==0){
                    isPrime = false;
                    break;
                }
            }
        }else {
            isPrime=false;
        }
        System.out.println("данное число "+given + " является простым? "+isPrime);
    }
}
