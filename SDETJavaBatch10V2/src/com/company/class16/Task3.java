package com.company.class16;

public class Task3 {
    public static void main(String[] args) {
        /*
        3. You have a String a="Is it saturday? Is it raining? Do we have a Java Class today?
        How would you find out how many sentence are in that String?
        3. У вас есть строка a="Сегодня суббота? Идет дождь? Будет ли у нас сегодня занятие по Java?
        Как бы вы узнали, сколько предложений содержится в этой строке?
         */
        String str="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(str.split("[?.!]").length);
        //.length() is a method from the String class thats why we need ()
        //.length() - это метод из класса String, поэтому нам нужно ()

    }
}
