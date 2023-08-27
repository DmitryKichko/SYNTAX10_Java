package com.company.class16;

public class Task4 {
    public static void main(String[] args) {
        //5. How would you reverse a String word by word?
        //5. Как бы вы перевернули строку слово за словом?
        String str="This is a sentence that i want to reverse";
        String[] arr=str.split(" ");
        StringBuilder reversed= new StringBuilder();
        for (String s : arr) {
            StringBuilder stringBuilder = new StringBuilder(s); //converting String to StringBuilder (преобразование строки в StringBuilder)
            stringBuilder.reverse(); // reverses the String (меняет строку на противоположную)
            reversed.append(stringBuilder).append(" "); // same as concat (то же, что и concat)

        }
        System.out.println(reversed);
    }
}
