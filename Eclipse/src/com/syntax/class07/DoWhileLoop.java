package com.syntax.class07;

public class DoWhileLoop {
    public static void main(String[] args) {

        System.out.println("---------- while ----------");

        int i = 1;

        while (i <= 3) {
            System.out.println("Привет");
            i++;
        }

        System.out.println(" ------- do while ------------- ");

        int j = 1;

        do {
            System.out.println("Привет");
            j++;
        } while (j <= 3);

        System.out.println("---------------------------------");

        //вывести числа от 1 до 10 с помощью цикла do while

        int n = 1;

        do {
            System.out.println(n);
            n++;
        } while (n <= 10);


    }
}
