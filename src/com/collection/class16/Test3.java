package com.collection.class16;

public class Test3 {

    public static void main(String[] args) {
        /*
        3. У вас есть String a = "Сегодня суббота? Идет ли дождь? У нас сегодня занятие по Java?".
        Как бы вы узнали, сколько предложений в строке?
         */

        String str = "Сегодня суббота? Идет ли дождь? У нас сегодня занятие по Java?";
        System.out.println(str.split("[?]").length);
        // .length - это свойство, а не метод поэто () в конце не нужны


    }
}
