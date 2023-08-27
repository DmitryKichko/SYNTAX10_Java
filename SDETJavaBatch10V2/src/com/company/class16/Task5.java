package com.company.class16;

public class Task5 {
    public static void main(String[] args) {
        // 6. How would you check if String is palindrome or not?
        // Как проверить, является ли строка палиндромом или нет?
        String str="awa";
        String reversed= new StringBuilder(str).reverse().toString();
        if(str.equals(reversed)) {
            System.out.println("palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }
}
