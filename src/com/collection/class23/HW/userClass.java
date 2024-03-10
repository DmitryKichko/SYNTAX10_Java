package com.collection.class23.HW;

public class userClass {

    /*
    1. Написать программу: userClass, которая имеет конструктор, инициализирующий переменную экземпляра имя и номер мобильного телефона.
    Создать подкласс userInfo, который будет содержать переменную адреса пользователя и также инициализироваться через вызов конструктора.
    Вывести имя, номер мобильного телефона и адрес пользователя в методе userDetails.
    Протестируйте свой код.
     */
    String name;
    String phoneNumber;

    userClass(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

}
