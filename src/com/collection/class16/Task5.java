package com.collection.class16;

public class Task5 {

    public static void main(String[] args) {
        /*
        6. Как проверить, является ли строка палиндромом или нет?
        Палидром - это строка, которую если мы ее перевернем она будет такая же
         */

        String str = "aba";
        String reversed = new StringBuilder(str).reverse().toString();

        if(str.equals(reversed)){
            System.out.println("это палидром");
        }else {
            System.out.println("это не палидром");
        }
    }
}
