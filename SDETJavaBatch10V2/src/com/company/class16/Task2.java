package com.company.class16;

public class Task2 {
    public static void main(String[] args) {
        /*
        2. Create a String that should be combination of letters,
        numbers and special characters. Find out how many alpha
        characters are there in the String.
        2. Создайте строку, которая должна представлять собой комбинацию букв,
        цифр и специальных символов.
        Определите, сколько буквенных символов в строке.
         */
        //To format the code CTL+ALT+L (for Windows)
        //To format the code CMD+alt+L (for Mac)
        String str ="ajfaASDFR1234!@#$%^";
        System.out.println(str.replaceAll("[^A-Za-z0-9]", "").length());


    }
}
