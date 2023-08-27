package com.company.class18;

public class Task3 {

    /*
     3. Create a method that will accept a String as a parameter and
     return a new String that consist only of vowels.
     Method should be available inside the class only where it was
     declared and executed by calling it is name.

     3. Создайте метод, который будет принимать в качестве параметра строку String и
     возвращать новую строку, состоящую только из гласных букв.
     Метод должен быть доступен только внутри класса, в котором он был объявлен, и выполняться
    путем вызова по имени.
     */

    private static  String onlyVowels(String inputStr){
        return inputStr.replaceAll("[^aeiouAEIOU]", "");
    }

    public static void main(String[] args) {
        System.out.println(onlyVowels("abcdefghiaeioU"));
    }
}
