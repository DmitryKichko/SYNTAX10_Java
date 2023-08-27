package com.company.class2624.task1;

public class Computer {
    int MainMemory;
    double price;
    String make;
    Computer(){
        System.out.println("Parent");
    }
    /*
   1) Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some
of the methods in child class
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object
and execute available methods.

1) Создайте класс Computer, который будет иметь 4 подкласса Apple, Lenovo, HP, Dell.
Определите общее поведение внутри и некоторые поля в родительском классе и переопределите некоторые
методы в дочернем классе
Определите некоторые методы, специфичные для дочерних классов
Создайте объекты дочерних классов и сохраните их в массив. Пройдитесь по каждому объекту
и выполните доступные методы
     */

    void browseInternet(){
        System.out.println("You can browse internet on Computer");
    }
    void openFiles(){
        System.out.println("Yoy can open different files on a Computer");
    }

}
class Apple extends Computer{

    Apple(){
        System.out.println("Apple");
    }

    void useItunes(){
        System.out.println("you can use ITunes");
    }
    void browseInternet(){
        System.out.println("You can browse internet on Apple using Safari");
    }
}
class Lenovo extends Computer{
    Lenovo(){
        System.out.println("Lenovo");
    }
    void VantageApp(){
        System.out.println("Use vintage app to customize me");
    }
    void browseInternet(){
        System.out.println("You can browse internet on Lenovo using GoogleCHrome");
    }
}
class HP extends Computer{
    HP(){
        System.out.println("HP");
    }
    void HPSmartApp(){
        System.out.println("Use HPSmartApp app to customize me");
    }
    void browseInternet(){
        System.out.println("You can browse internet on HP using Firefox");
    }
}
class Dell extends Computer{
    Dell(){
        System.out.println("Dell");
    }
    void DellSupportApp(){
        System.out.println("Use DellSupportApp app to customize me");
    }
    void browseInternet(){
        System.out.println("You can browse internet on Dell using IE");
    }
}