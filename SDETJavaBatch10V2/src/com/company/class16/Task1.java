package com.company.class16;

public class Task1 {
    public static void main(String[] args) {
        /*
        1. Create a String that will hold a sentence. Write a program to get a new String without spaces.
        2. Create a String that should be combination of letters, numbers and special characters. Find out how many alpha
        characters are there in the String.
        3. You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?
        How would you find out how many sentence are in that String?
        4. How would you reverse a String character by character?
        5. How would you reverse a String word by word?
        6. How would you check if String is palindrome or not?
        7. How would you swap 2 strings without a temporary variable?
        1. Создайте Строку, в которой будет храниться предложение.
        Напишите программу для получения новой строки без пробелов.
        2. Создайте строку, которая должна представлять собой комбинацию букв, цифр и специальных символов.
        Определите, сколько буквенных символов в строке.
        3. У вас есть строка a="Сегодня суббота? Идет дождь? Будет ли у нас сегодня занятие по Java?
        Как бы вы узнали, сколько предложений содержится в этой строке?
        4. Как бы вы развернули строку символ за символом?
        5. Как бы вы перевернули строку слово за словом?
        6. Как проверить, является ли строка палиндромом или нет?
        7. Как бы вы поменяли местами 2 строки без временной переменной?
         */
        String str="This is a sentence with spaces";
        System.out.println(str.replace(" ","")); // removes the spaces from the sentence (удаляет пробелы из предложения)
        System.out.println(str.replaceAll(" ","")); // removes the spaces from the sentence (удаляет пробелы из предложения)
        System.out.println(str.replaceAll("\\s","")); // removes the spaces from the sentence (удаляет пробелы из предложения)

    }
}
