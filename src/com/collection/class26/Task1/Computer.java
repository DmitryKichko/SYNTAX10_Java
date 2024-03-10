package com.collection.class26.Task1;

/*
HW:
- Создайте класс Компьютер, который будет иметь 4 подкласса: Apple, Lenovo, HP, Dell.
- Определите общее поведение внутри и некоторые поля в родительском классе и переопределите некоторые методы в дочернем классе.
- Определите некоторые методы, специфичные для дочерних классов
- Создайте объекты дочерних классов и сохраните их в массив. Пройдитесь по каждому объекту и выполните доступные методы
 */
public class Computer {

    int MainMemory;
    double price;
    String make;


    void browseInternet(){
        System.out.println("Вы можете просматривать Интернет на компьютере");
    }
    void openFiles(){
        System.out.println("На одном компьютере можно открывать различные файлы");
    }

}
class Apple extends Computer{

    void useItunes(){
        System.out.println("Вы можете использовать ITunes");
    }
    void browseInternet(){
        System.out.println("Вы можете просматривать Интернет на компьютере Apple используя Safari");
    }
}

class Lenovo extends Computer {

    void VantageApp() {
        System.out.println("Используйте приложение vantage для костомизации");
    }
    void browseInternet(){
        System.out.println("Вы можете просматривать Интернет на компьютере Lenovo используя Google Chrome");
    }
}
    class HP extends Computer{
        void HPSmartApp(){
            System.out.println("Use HPSmartApp app to costomize me ");
        }
        void browseInternet(){
            System.out.println("Вы можете просматривать Интернет на компьютере HP используя FireFox");
        }
    }

    class Dell extends Computer{
        void HPSmartApp(){
            System.out.println("Use HPSmartApp app to costomize me");
        }
        void browseInternet(){
            System.out.println("Вы можете просматривать Интернет на компьютере Dell используя IE");
        }

}
