package com.company.class2321.task1;

public class UserClass {
    /*
    1. Write program: userClass that has a constructor that initializes instance variable
    name and mobile number. Create a subclass userInfo that will have user address variable
    and it also being initialized through constructor call. Print users name, mobile
    number and address in userDetails method.
    Test your code.

    1. Напишите программу: userClass, которая имеет конструктор, инициализирующий переменную экземпляра
    имя и номер мобильного телефона. Создайте подкласс userInfo, который будет иметь переменную адреса пользователя
    и она также инициализируется через вызов конструктора. Выведите имя пользователя, номер мобильного телефона
    номер и адрес в методе userDetails.
    Протестируйте свой код.

    2. Write program: Shape class has a constructor that takes the radius and has a subclass
    as circle class. In circle class create a method to calculate the area of circle.
    Test your code
     */
    String name;
    String mobileNumber;
    UserClass(String name, String mobileNumber){
        this.name=name;
        this.mobileNumber=mobileNumber;

    }
}
